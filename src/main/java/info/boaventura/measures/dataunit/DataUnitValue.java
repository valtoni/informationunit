package info.boaventura.measures.dataunit;

import info.boaventura.measures.Constants;
import info.boaventura.measures.DataMeasure;
import info.boaventura.measures.TypedValue;

import java.text.DecimalFormat;

public class DataUnitValue implements TypedValue {

  private double value;

  private DataMeasure measure = DataUnitISO.BYTE;

  private DecimalFormat formatter = new DecimalFormat(Constants.DEFAULT_DATA_FORMAT);

  public DataUnitValue(double value) {
    this.value = value;
  }

  public DataUnitValue(double value, DataMeasure measure) {
    this.value = value;
    this.measure = measure;
  }

  public void setDisplayFormat(String pattern) {
    formatter.applyPattern(pattern);
  }

  public double value() {
    return value;
  }

  public String unit() {
    return measure.toString();
  }

  public DataUnitValue plus(DataUnitValue value) {
    DataUnitValue clone = this.clone();
    if (value == null) return clone;
    clone.value += value.value(measure);
    return clone;
  }

  public double value(DataMeasure dataMeasure) {
    return dataMeasure.unitType().value(value).value;
  }

  public DataUnitValue clone() {
    return new DataUnitValue(value, measure);
  }

  public String textValue(DataMeasure dataMeasure) {
    return value(dataMeasure) + " " + unit();
  }

  public String toString() {
    return formatter.format(measure.unitType().value(value).value) + " " + measure;
  }

  public static void main(String[] args) {
    long kbyte = (long)Math.pow(2, 16);
    System.out.println(new DataUnitValue(kbyte));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.KiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.KB));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.MiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.MB));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.GiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.GB));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.TiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.TB));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.PiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.PB));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.EiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.EB));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.ZiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.ZB));
    System.out.println(new DataUnitValue(kbyte, DataUnitISO.YiB));
    System.out.println(new DataUnitValue(kbyte, DataUnitMetric.YB));
    DataUnitValue duv = new DataUnitValue(kbyte, DataUnitMetric.EB);
    duv.setDisplayFormat("0.###############################");
    System.out.println(duv);
  }

}
