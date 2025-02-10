package ser_deser;

import java.io.Serializable;

public class SerializableEntity implements Serializable {
    public int valueInt;
    public String valueString;

    public SerializableEntity(int valueInt, String valueString) {
        this.valueInt = valueInt;
        this.valueString = valueString;
    }

    public int getValueInt() {
        return valueInt;
    }

    public void setValueInt(int valueInt) {
        this.valueInt = valueInt;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    @Override
    public String toString() {
        return "SerializableEntity{" +
                "valueInt=" + valueInt +
                ", valueString='" + valueString + '\'' +
                '}';
    }
}
