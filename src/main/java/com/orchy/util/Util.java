package com.orchy.util;

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
                case NUMBER_VALUE:
                    double numberValue = v.getNumberValue();
                    if(numberValue % 1 == 0){
                        list.add((int)v.getNumberValue());
                    }else{
                        list.add(v.getNumberValue());
                    }
                case STRING_VALUE:
                    list.add(v.getStringValue());
                case LIST_VALUE:
                    list.addAll(convert(v.getListValue().getValuesList()));
                case STRUCT_VALUE:
                    list.add(convert(v.getStructValue().getFieldsMap()));
            }
        }
        return list;
    }
}
