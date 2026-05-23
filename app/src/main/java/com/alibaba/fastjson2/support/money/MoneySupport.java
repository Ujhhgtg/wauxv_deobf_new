package com.alibaba.fastjson2.support.money;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderImplValue;
import com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor;
import com.alibaba.fastjson2.support.LambdaMiscCodec;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import com.alibaba.fastjson2.writer.ObjectWriterCreator;
import com.alibaba.fastjson2.writer.ObjectWriters;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import p000.C2025;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class MoneySupport {
    static Class CLASS_CURRENCY_UNIT;
    static Class CLASS_DEFAULT_NUMBER_VALUE;
    static Class CLASS_MONETARY;
    static Class CLASS_MONETARY_AMOUNT;
    static Class CLASS_MONETARY_AMOUNT_FACTORY;
    static Class CLASS_NUMBER_VALUE;
    static Function<Object, Object> FUNC_CREATE;
    static Function<String, Object> FUNC_GET_CURRENCY;
    static Supplier<Object> FUNC_GET_DEFAULT_AMOUNT_FACTORY;
    static Function<Object, BigDecimal> FUNC_NUMBER_VALUE;
    static BiFunction<Object, Object, Object> FUNC_SET_CURRENCY;
    static BiFunction<Object, Object, Number> FUNC_SET_NUMBER;
    static Method METHOD_NUMBER_VALUE_OF;

    public static ObjectReader createCurrencyUnitReader() {
        if (CLASS_MONETARY == null) {
            CLASS_MONETARY = TypeUtils.loadClass("javax.money.Monetary");
        }
        if (CLASS_CURRENCY_UNIT == null) {
            CLASS_CURRENCY_UNIT = TypeUtils.loadClass("javax.money.CurrencyUnit");
        }
        if (FUNC_GET_CURRENCY == null) {
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(CLASS_MONETARY);
            try {
                FUNC_GET_CURRENCY = new C2025((BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup, "apply", TypeUtils.METHOD_TYPE_BI_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT_OBJECT, lookupTrustedLookup.findStatic(CLASS_MONETARY, "getCurrency", MethodType.methodType(CLASS_CURRENCY_UNIT, String.class, String[].class)), MethodType.methodType(CLASS_CURRENCY_UNIT, String.class, String[].class)).getTarget().invokeExact(), 1);
            } catch (Throwable th) {
                throw new JSONException("method not found : javax.money.Monetary.getCurrency", th);
            }
        }
        return ObjectReaderImplValue.of(CLASS_CURRENCY_UNIT, String.class, FUNC_GET_CURRENCY);
    }

    public static Object createMonetaryAmount(Object obj, Object obj2) {
        if (CLASS_NUMBER_VALUE == null) {
            CLASS_NUMBER_VALUE = TypeUtils.loadClass("javax.money.NumberValue");
        }
        if (CLASS_CURRENCY_UNIT == null) {
            CLASS_CURRENCY_UNIT = TypeUtils.loadClass("javax.money.CurrencyUnit");
        }
        if (CLASS_MONETARY == null) {
            CLASS_MONETARY = TypeUtils.loadClass("javax.money.Monetary");
        }
        if (CLASS_MONETARY_AMOUNT == null) {
            CLASS_MONETARY_AMOUNT = TypeUtils.loadClass("javax.money.MonetaryAmount");
        }
        if (CLASS_MONETARY_AMOUNT_FACTORY == null) {
            CLASS_MONETARY_AMOUNT_FACTORY = TypeUtils.loadClass("javax.money.MonetaryAmountFactory");
        }
        if (FUNC_GET_DEFAULT_AMOUNT_FACTORY == null) {
            MethodHandles.Lookup lookupTrustedLookup = JDKUtils.trustedLookup(CLASS_MONETARY);
            try {
                FUNC_GET_DEFAULT_AMOUNT_FACTORY = (Supplier) LambdaMetafactory.metafactory(lookupTrustedLookup, "get", TypeUtils.METHOD_TYPE_SUPPLIER, TypeUtils.METHOD_TYPE_OBJECT, lookupTrustedLookup.findStatic(CLASS_MONETARY, "getDefaultAmountFactory", MethodType.methodType(CLASS_MONETARY_AMOUNT_FACTORY)), MethodType.methodType(CLASS_MONETARY_AMOUNT_FACTORY)).getTarget().invokeExact();
            } catch (Throwable th) {
                throw new JSONException("method not found : javax.money.Monetary.getDefaultAmountFactory", th);
            }
        }
        if (FUNC_SET_CURRENCY == null) {
            MethodHandles.Lookup lookupTrustedLookup2 = JDKUtils.trustedLookup(CLASS_MONETARY_AMOUNT_FACTORY);
            try {
                Class<?> cls = CLASS_MONETARY_AMOUNT_FACTORY;
                MethodHandle methodHandleFindVirtual = lookupTrustedLookup2.findVirtual(cls, "setCurrency", MethodType.methodType(cls, (Class<?>) CLASS_CURRENCY_UNIT));
                MethodType methodType = TypeUtils.METHOD_TYPE_BI_FUNCTION;
                MethodType methodType2 = TypeUtils.METHOD_TYPE_OBJECT_OBJECT_OBJECT;
                Class cls2 = CLASS_MONETARY_AMOUNT_FACTORY;
                FUNC_SET_CURRENCY = (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup2, "apply", methodType, methodType2, methodHandleFindVirtual, MethodType.methodType(cls2, cls2, CLASS_CURRENCY_UNIT)).getTarget().invokeExact();
            } catch (Throwable th2) {
                throw new JSONException("method not found : javax.money.NumberValue.numberValue", th2);
            }
        }
        if (FUNC_SET_NUMBER == null) {
            MethodHandles.Lookup lookupTrustedLookup3 = JDKUtils.trustedLookup(CLASS_MONETARY_AMOUNT_FACTORY);
            try {
                Class<?> cls3 = CLASS_MONETARY_AMOUNT_FACTORY;
                MethodHandle methodHandleFindVirtual2 = lookupTrustedLookup3.findVirtual(cls3, "setNumber", MethodType.methodType(cls3, (Class<?>) Number.class));
                MethodType methodType3 = TypeUtils.METHOD_TYPE_BI_FUNCTION;
                MethodType methodType4 = TypeUtils.METHOD_TYPE_OBJECT_OBJECT_OBJECT;
                Class cls4 = CLASS_MONETARY_AMOUNT_FACTORY;
                FUNC_SET_NUMBER = (BiFunction) LambdaMetafactory.metafactory(lookupTrustedLookup3, "apply", methodType3, methodType4, methodHandleFindVirtual2, MethodType.methodType(cls4, cls4, Number.class)).getTarget().invokeExact();
            } catch (Throwable th3) {
                throw new JSONException("method not found : javax.money.NumberValue.numberValue", th3);
            }
        }
        if (FUNC_CREATE == null) {
            MethodHandles.Lookup lookupTrustedLookup4 = JDKUtils.trustedLookup(CLASS_MONETARY_AMOUNT_FACTORY);
            try {
                FUNC_CREATE = (Function) LambdaMetafactory.metafactory(lookupTrustedLookup4, "apply", TypeUtils.METHOD_TYPE_FUNCTION, TypeUtils.METHOD_TYPE_OBJECT_OBJECT, lookupTrustedLookup4.findVirtual(CLASS_MONETARY_AMOUNT_FACTORY, "create", MethodType.methodType(CLASS_MONETARY_AMOUNT)), MethodType.methodType((Class<?>) CLASS_MONETARY_AMOUNT, (Class<?>) CLASS_MONETARY_AMOUNT_FACTORY)).getTarget().invokeExact();
            } catch (Throwable th4) {
                throw new JSONException("method not found : javax.money.NumberValue.numberValue", th4);
            }
        }
        Object obj3 = FUNC_GET_DEFAULT_AMOUNT_FACTORY.get();
        if (obj != null) {
            FUNC_SET_CURRENCY.apply(obj3, obj);
        }
        if (obj2 != null) {
            FUNC_SET_NUMBER.apply(obj3, obj2);
        }
        return FUNC_CREATE.apply(obj3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static ObjectReader createMonetaryAmountReader() {
        if (CLASS_NUMBER_VALUE == null) {
            CLASS_NUMBER_VALUE = TypeUtils.loadClass("javax.money.NumberValue");
        }
        if (CLASS_CURRENCY_UNIT == null) {
            CLASS_CURRENCY_UNIT = TypeUtils.loadClass("javax.money.CurrencyUnit");
        }
        try {
            Method method = MoneySupport.class.getMethod("createMonetaryAmount", Object.class, Object.class);
            String[] strArr = {"currency", "number"};
            ObjectReaderCreator objectReaderCreator = ObjectReaderCreator.INSTANCE;
            Function functionCreateFactoryFunction = objectReaderCreator.createFactoryFunction(method, strArr);
            Class cls = CLASS_CURRENCY_UNIT;
            FieldReader fieldReaderCreateFieldReaderParam = objectReaderCreator.createFieldReaderParam(MoneySupport.class, MoneySupport.class, "currency", 0, 0L, null, cls, cls, "currency", null, null, null);
            Class cls2 = CLASS_DEFAULT_NUMBER_VALUE;
            return new ObjectReaderNoneDefaultConstructor(null, null, null, 0L, functionCreateFactoryFunction, null, strArr, new FieldReader[]{fieldReaderCreateFieldReaderParam, objectReaderCreator.createFieldReaderParam(MoneySupport.class, MoneySupport.class, "number", 0, 0L, null, cls2, cls2, "number", null, null, null)}, null, null, null);
        } catch (NoSuchMethodException e) {
            throw new JSONException("createMonetaryAmountReader error", e);
        }
    }

    public static ObjectWriter createMonetaryAmountWriter() {
        if (CLASS_MONETARY == null) {
            CLASS_MONETARY = TypeUtils.loadClass("javax.money.Monetary");
        }
        if (CLASS_MONETARY_AMOUNT == null) {
            CLASS_MONETARY_AMOUNT = TypeUtils.loadClass("javax.money.MonetaryAmount");
        }
        if (CLASS_NUMBER_VALUE == null) {
            CLASS_NUMBER_VALUE = TypeUtils.loadClass("javax.money.NumberValue");
        }
        if (CLASS_CURRENCY_UNIT == null) {
            CLASS_CURRENCY_UNIT = TypeUtils.loadClass("javax.money.CurrencyUnit");
        }
        try {
            Function functionCreateFunction = LambdaMiscCodec.createFunction(CLASS_MONETARY_AMOUNT.getMethod("getCurrency", null));
            try {
                Function functionCreateFunction2 = LambdaMiscCodec.createFunction(CLASS_MONETARY_AMOUNT.getMethod("getNumber", null));
                ObjectWriterCreator objectWriterCreator = ObjectWriterCreator.INSTANCE;
                Class cls = CLASS_CURRENCY_UNIT;
                FieldWriter fieldWriterCreateFieldWriter = objectWriterCreator.createFieldWriter("currency", cls, cls, functionCreateFunction);
                Class cls2 = CLASS_NUMBER_VALUE;
                return new ObjectWriterAdapter(CLASS_MONETARY_AMOUNT, null, null, 0L, Arrays.asList(fieldWriterCreateFieldWriter, objectWriterCreator.createFieldWriter("number", cls2, cls2, functionCreateFunction2)));
            } catch (Throwable th) {
                throw new JSONException("method not found : javax.money.Monetary.getNumber", th);
            }
        } catch (Throwable th2) {
            throw new JSONException("method not found : javax.money.Monetary.getCurrency", th2);
        }
    }

    public static ObjectReader createNumberValueReader() {
        if (CLASS_DEFAULT_NUMBER_VALUE == null) {
            CLASS_DEFAULT_NUMBER_VALUE = TypeUtils.loadClass("org.javamoney.moneta.spi.DefaultNumberValue");
        }
        if (METHOD_NUMBER_VALUE_OF == null) {
            try {
                METHOD_NUMBER_VALUE_OF = CLASS_DEFAULT_NUMBER_VALUE.getMethod("of", Number.class);
            } catch (NoSuchMethodException e) {
                throw new JSONException("method not found : org.javamoney.moneta.spi.DefaultNumberValue.of", e);
            }
        }
        if (CLASS_NUMBER_VALUE == null) {
            CLASS_NUMBER_VALUE = TypeUtils.loadClass("javax.money.NumberValue");
        }
        return ObjectReaderImplValue.of(CLASS_NUMBER_VALUE, BigDecimal.class, METHOD_NUMBER_VALUE_OF);
    }

    public static ObjectWriter createNumberValueWriter() {
        if (CLASS_NUMBER_VALUE == null) {
            CLASS_NUMBER_VALUE = TypeUtils.loadClass("javax.money.NumberValue");
        }
        if (FUNC_NUMBER_VALUE == null) {
            try {
                FUNC_NUMBER_VALUE = new C2025(LambdaMiscCodec.createBiFunction(CLASS_NUMBER_VALUE.getMethod("numberValue", Class.class)), 0);
            } catch (Throwable th) {
                throw new JSONException("method not found : javax.money.NumberValue.numberValue", th);
            }
        }
        return ObjectWriters.ofToBigDecimal(FUNC_NUMBER_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$createCurrencyUnitReader$0(BiFunction biFunction, String str) {
        return biFunction.apply(str, new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ BigDecimal lambda$createNumberValueWriter$0(BiFunction biFunction, Object obj) {
        return (BigDecimal) biFunction.apply(obj, BigDecimal.class);
    }
}
