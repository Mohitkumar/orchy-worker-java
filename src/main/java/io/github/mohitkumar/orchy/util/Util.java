package io.github.mohitkumar.orchy.util;

import com.google.protobuf.ListValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Util {
    public static Map<String, Object> convert(Map<String, Value> input){
        Map<String, Object> output = new HashMap<>();
        input.forEach((k, v)->{
            Value.KindCase kindCase = v.getKindCase();
            switch (kindCase){
                case BOOL_VALUE:
                    output.put(k, v.getBoolValue());
                    break;
                case NUMBER_VALUE:
                    double numberValue = v.getNumberValue();
                    if(numberValue % 1 == 0){
                        output.put(k, (int)numberValue);
                    }else{
                        output.put(k, numberValue);
                    }
                    break;
                case STRING_VALUE:
                    output.put(k, v.getStringValue());
                    break;
                case STRUCT_VALUE:
                    Map<String, Value> fieldsMap = v.getStructValue().getFieldsMap();
                    output.put(k, convert(fieldsMap));
                    break;
                case LIST_VALUE:
                    output.put(k,convert(v.getListValue().getValuesList()));
                    break;
            }
        });
        return output;
    }

    private static List<Object> convert(List<Value> values){
        List<Object> list = new ArrayList<>();
        for (Value v : values) {
            switch (v.getKindCase()){
                case BOOL_VALUE:
                    list.add(v.getBoolValue());
                    break;
                case NUMBER_VALUE:
                    double numberValue = v.getNumberValue();
                    if(numberValue % 1 == 0){
                        list.add((int)v.getNumberValue());
                    }else{
                        list.add(v.getNumberValue());
                    }
                    break;
                case STRING_VALUE:
                    list.add(v.getStringValue());
                    break;
                case LIST_VALUE:
                    list.addAll(convert(v.getListValue().getValuesList()));
                    break;
                case STRUCT_VALUE:
                    list.add(convert(v.getStructValue().getFieldsMap()));
                    break;
            }
        }
        return list;
    }

    public static Map<String, Value>  convertRev(Map<String, Object> input){
        Map<String, Value> output = new HashMap<>();
        input.forEach((k,v) ->{
            if( v instanceof String){
                output.put(k, Value.newBuilder().setStringValue((String)v).build());
            } else if (v instanceof Integer) {
                output.put(k, Value.newBuilder().setNumberValue((int)v).build());
            } else if (v instanceof Double) {
                output.put(k, Value.newBuilder().setNumberValue((double)v).build());
            } else if (v instanceof Boolean) {
                output.put(k, Value.newBuilder().setBoolValue((boolean)v).build());
            } else if (v instanceof List) {
                output.put(k, Value.newBuilder()
                        .setListValue(ListValue.newBuilder().addAllValues(convertRev((List)v)).build()).build());
            } else if (v instanceof Map) {
                Map<String, Value> map = convertRev((Map<String, Object>) v);
                output.put(k, Value.newBuilder()
                        .setStructValue(Struct.newBuilder().putAllFields(map).build()).build());
            }
        });
        return output;
    }

    private static List<Value> convertRev(List<Object> input){
        List<Value> out = new ArrayList<>();
        for (Object v : input) {
            if( v instanceof String){
                out.add(Value.newBuilder().setStringValue((String)v).build());
            } else if (v instanceof Integer) {
                out.add(Value.newBuilder().setNumberValue((int)v).build());
            } else if (v instanceof Double) {
                out.add(Value.newBuilder().setNumberValue((double)v).build());
            } else if (v instanceof Boolean) {
                out.add(Value.newBuilder().setBoolValue((boolean)v).build());
            } else if (v instanceof List) {
                out.addAll(convertRev((List)v));
            } else if (v instanceof Map) {
                Map<String, Value> map = convertRev((Map<String, Object>) v);
                out.add(Value.newBuilder()
                        .setStructValue(Struct.newBuilder().putAllFields(map).build()).build());
            }
        }
        return out;
    }
}
