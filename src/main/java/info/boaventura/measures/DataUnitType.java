package info.boaventura.measures;

import info.boaventura.measures.dataunit.DataUnitValue;

public interface DataUnitType {

  /**
   * This is default textValue to this info.boaventura.measures.dataunit type.
   * @param bytes textValue to be converted
   * @return textValue converted
   */
  DataUnitValue value(double bytes);

  /**
   * This is most properly textValue to indicated textValue.
   * @param bytes textValue to be converted
   * @return textValue converted
   */
  DataUnitValue dynamicValue(double bytes);

  /**
   * Value in measure informed.
   * @param bytes textValue to be converted
   * @param measure target measure
   * @return textValue converted
   */
  DataUnitValue value(double bytes, DataMeasure measure);

  /**
   * Change de measure type for this textValue type
   * @param measure the new default measure
   */
  void changeDefaultType(DataMeasure measure);

}
