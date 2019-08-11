package info.boaventura.measures.dataunit;

import info.boaventura.measures.DataMeasure;
import info.boaventura.measures.DataUnitType;

public enum DataUnitMetric implements DataMeasure {

  BYTE, KB, MB, GB, TB, PB, EB, ZB, YB;

  private DataUnitTypeMetric dataUnitType;

  public int scale() {
    return ordinal();
  }

  DataUnitMetric() {
     this.dataUnitType = new DataUnitTypeMetric(this);
  }

  public DataUnitMetric value(int index) {
    if (index >= values().length)
      throw new RuntimeException("Index " + index + " is out of range for measure " + DataUnitMetric.class);
    return DataUnitMetric.values()[index];
  }

  public DataUnitType unitType() {
    return dataUnitType;
  }

}