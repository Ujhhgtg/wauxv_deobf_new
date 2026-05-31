package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.impl.ToBigDecimal;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplBigDecimal extends ObjectReaderPrimitive {
    static final ObjectReaderImplBigDecimal INSTANCE = new ObjectReaderImplBigDecimal(null);
    private final Function converter;
    final Function<BigDecimal, Object> function;

    public ObjectReaderImplBigDecimal(Function<BigDecimal, Object> function) {
        super(BigDecimal.class);
        this.converter = new ToBigDecimal();
        this.function = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j) {
        Object objApply = map.get("value");
        if (objApply == null) {
            objApply = map.get("$numberDecimal");
        }
        if (!(objApply instanceof BigDecimal)) {
            objApply = this.converter.apply(objApply);
        }
        BigDecimal bigDecimal = (BigDecimal) objApply;
        Function<BigDecimal, Object> function = this.function;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j) {
        BigDecimal bigDecimal = jSONReader.readBigDecimal();
        Function<BigDecimal, Object> function = this.function;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j) {
        BigDecimal bigDecimal = jSONReader.readBigDecimal();
        Function<BigDecimal, Object> function = this.function;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }
}
