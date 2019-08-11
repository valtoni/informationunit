package info.boaventura.measures.dataunit;

import info.boaventura.measures.BasicMath;
import info.boaventura.measures.DataMeasure;
import info.boaventura.measures.DataUnitType;

public class DataUnitTypeISO implements DataUnitType {

  private DataMeasure defaultMeasure;

  public DataUnitTypeISO(DataMeasure measure) {
    this.defaultMeasure = measure;
  }

  public DataUnitValue value(double bytes, DataMeasure measure) {
    int index = measure.scale();
    double display = bytes / Math.pow(2, index * 10);
    return new DataUnitValue(display, measure);
  }

  public DataUnitValue value(double bytes) {
    return value(bytes, defaultMeasure);
  }

  public DataUnitValue dynamicValue(double bytes) {
    double log2value = BasicMath.log2(bytes);
    return value(bytes, DataUnitISO.values()[(int) (log2value / 10)]);
  }

  public void changeDefaultType(DataMeasure measure) {
    this.defaultMeasure = measure;
  }

}
