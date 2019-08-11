package info.boaventura.measures.dataunit;

import info.boaventura.measures.DataMeasure;
import info.boaventura.measures.DataUnitType;

public enum DataUnitISO implements DataMeasure {

  BYTE, KiB, MiB, GiB, TiB, PiB, EiB, ZiB, YiB;

  private DataUnitTypeISO dataUnitType;

  public int scale() {
    return ordinal();
  }

  DataUnitISO() {
    dataUnitType = new DataUnitTypeISO(this);
  }

  public DataMeasure value(int index) {
    if (index >= values().length)
      throw new RuntimeException("Index " + index + " is out of range for measure " + DataUnitISO.class);
    return DataUnitISO.values()[index];
  }

  @Override
  public DataUnitType unitType() {
    return dataUnitType;
  }

}