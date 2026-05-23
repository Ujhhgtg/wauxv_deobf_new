package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplBigDecimal extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplBigDecimal INSTANCE = new ObjectWriterImplBigDecimal(null, null);
    private final DecimalFormat format;
    final Function<Object, BigDecimal> function;

    public ObjectWriterImplBigDecimal(DecimalFormat decimalFormat, Function<Object, BigDecimal> function) {
        this.format = decimalFormat;
        this.function = function;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl
    public Function getFunction() {
        return this.function;
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Function<Object, BigDecimal> function = this.function;
        jSONWriter.writeDecimal((function == null || obj == null) ? (BigDecimal) obj : function.apply(obj), j, this.format);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j) {
        Function<Object, BigDecimal> function = this.function;
        jSONWriter.writeDecimal((function == null || obj == null) ? (BigDecimal) obj : function.apply(obj), j, this.format);
    }
}
