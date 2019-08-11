package info.boaventura.measures;

public interface DataMeasure {

  int scale();

  DataMeasure value(int index);

  DataUnitType unitType();

}
