package com.alibaba.fastjson2.annotation;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.JSONWriter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JSONField {
    String[] alternateNames() default {};

    Class<?> arrayToMapDuplicateHandler() default Void.class;

    String arrayToMapKey() default "";

    Class<?> contentAs() default Void.class;

    String defaultValue() default "";

    boolean deserialize() default true;

    JSONReader.Feature[] deserializeFeatures() default {};

    Class deserializeUsing() default Void.class;

    String format() default "";

    boolean jsonDirect() default false;

    String label() default "";

    String locale() default "";

    String name() default "";

    int ordinal() default 0;

    boolean required() default false;

    String schema() default "";

    boolean serialize() default true;

    JSONWriter.Feature[] serializeFeatures() default {};

    Class serializeUsing() default Void.class;

    boolean skipTransient() default true;

    boolean unwrapped() default false;

    boolean value() default false;

    @Deprecated
    Class writeUsing() default Void.class;
}
