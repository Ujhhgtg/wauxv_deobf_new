package com.alibaba.fastjson2.modules;

import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterCreator;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectWriterModule {
    default boolean createFieldWriters(ObjectWriterCreator objectWriterCreator, Class cls, List<FieldWriter> list) {
        return false;
    }

    default ObjectWriterAnnotationProcessor getAnnotationProcessor() {
        return null;
    }

    default ObjectWriter getObjectWriter(Type type, Class cls) {
        return null;
    }

    default ObjectWriterProvider getProvider() {
        return null;
    }

    default void init(ObjectWriterProvider objectWriterProvider) {
    }
}
