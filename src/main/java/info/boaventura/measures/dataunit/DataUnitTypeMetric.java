package info.boaventura.measures.dataunit;

import info.boaventura.measures.BasicMath;
import info.boaventura.measures.DataMeasure;
import info.boaventura.measures.DataUnitType;

public class DataUnitTypeMetric implements DataUnitType {

  private DataMeasure defaultMeasure;

  public DataUnitTypeMetric(DataMeasure defaultMeasure) {
    this.defaultMeasure = defaultMeasure;
  }

  public DataUnitValue value(double bytes, DataMeasure metric) {
    int index = metric.scale();
    double display = bytes / Math.pow(1000.0, index);
    return new DataUnitValue(display, metric);
  }

  public void changeDefaultType(DataMeasure measure) {
    this.defaultMeasure = measure;
  }

  public DataUnitValue dynamicValue(double bytes) {
    int index = (int) BasicMath.log10(bytes);
    return value(bytes, defaultMeasure.value(index));
  }

  public DataUnitValue value(double bytes) {
    return value(bytes, defaultMeasure);
  }

}
