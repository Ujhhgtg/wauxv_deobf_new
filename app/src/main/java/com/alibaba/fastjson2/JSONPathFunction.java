package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.function.impl.ToDouble;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathFunction extends JSONPathSegment implements JSONPathSegment.EvalSegment {
    final Function function;
    static final JSONPathFunction FUNC_TYPE = new JSONPathFunction(new C0015(1));
    static final JSONPathFunction FUNC_DOUBLE = new JSONPathFunction(new ToDouble(null));
    static final JSONPathFunction FUNC_FLOOR = new JSONPathFunction(new C0015(4));
    static final JSONPathFunction FUNC_CEIL = new JSONPathFunction(new C0015(5));
    static final JSONPathFunction FUNC_ABS = new JSONPathFunction(new C0015(6));
    static final JSONPathFunction FUNC_NEGATIVE = new JSONPathFunction(new C0015(7));
    static final JSONPathFunction FUNC_EXISTS = new JSONPathFunction(new C0015(8));
    static final JSONPathFunction FUNC_LOWER = new JSONPathFunction(new C0015(9));
    static final JSONPathFunction FUNC_UPPER = new JSONPathFunction(new C0015(10));
    static final JSONPathFunction FUNC_TRIM = new JSONPathFunction(new C0015(11));
    static final JSONPathFunction FUNC_FIRST = new JSONPathFunction(new C0015(2));
    static final JSONPathFunction FUNC_LAST = new JSONPathFunction(new C0015(3));

    /* JADX INFO: compiled from: obf */
    public static final class BiFunctionAdapter implements BiFunction {
        private final Function function;

        public BiFunctionAdapter(Function function) {
            this.function = function;
        }

        @Override // java.util.function.BiFunction
        public Object apply(Object obj, Object obj2) {
            return this.function.apply(obj2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class FilterFunction implements Function {
        final JSONPathFilter filter;

        public FilterFunction(JSONPathFilter jSONPathFilter) {
            this.filter = jSONPathFilter;
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            return null;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static abstract class Index implements Function {
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            if (obj == null) {
                return null;
            }
            int i = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                while (i < list.size()) {
                    if (eq(list.get(i))) {
                        return Integer.valueOf(i);
                    }
                    i++;
                }
                return -1;
            }
            if (!obj.getClass().isArray()) {
                return eq(obj) ? 0 : null;
            }
            int length = Array.getLength(obj);
            while (i < length) {
                if (eq(Array.get(obj, i))) {
                    return Integer.valueOf(i);
                }
                i++;
            }
            return -1;
        }

        public abstract boolean eq(Object obj);
    }

    /* JADX INFO: compiled from: obf */
    public static final class IndexDecimal extends Index {
        final BigDecimal value;

        public IndexDecimal(BigDecimal bigDecimal) {
            this.value = bigDecimal;
        }

        @Override // com.alibaba.fastjson2.JSONPathFunction.Index
        public boolean eq(Object obj) {
            if (obj == null) {
                return false;
            }
            if (obj instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                return this.value.equals(bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros());
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                BigDecimal bigDecimal2 = new BigDecimal(((Number) obj).doubleValue());
                return this.value.equals(bigDecimal2.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal2.stripTrailingZeros());
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (TypeUtils.isNumber(str)) {
                    BigDecimal bigDecimal3 = new BigDecimal(str);
                    return this.value.equals(bigDecimal3.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal3.stripTrailingZeros());
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class IndexInt extends Index {
        transient BigDecimal decimalValue;
        final long value;

        public IndexInt(long j) {
            this.value = j;
        }

        @Override // com.alibaba.fastjson2.JSONPathFunction.Index
        public boolean eq(Object obj) {
            if ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Byte) || (obj instanceof Short)) {
                return ((Number) obj).longValue() == this.value;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                return ((Number) obj).doubleValue() == ((double) this.value);
            }
            if (!(obj instanceof BigDecimal)) {
                return false;
            }
            BigDecimal bigDecimal = (BigDecimal) obj;
            BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            if (this.decimalValue == null) {
                this.decimalValue = BigDecimal.valueOf(this.value);
            }
            return this.decimalValue.equals(bigDecimal2);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class IndexString extends Index {
        final String value;

        public IndexString(String str) {
            this.value = str;
        }

        @Override // com.alibaba.fastjson2.JSONPathFunction.Index
        public boolean eq(Object obj) {
            if (obj == null) {
                return false;
            }
            return this.value.equals(obj.toString());
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class IndexValue implements Function {
        final int index;

        public IndexValue(int i) {
            this.index = i;
        }

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (obj == null) {
                return null;
            }
            if (obj instanceof List) {
                return ((List) obj).get(this.index);
            }
            if (obj.getClass().isArray()) {
                return Array.get(obj, this.index);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class SizeFunction implements Function {
        static final SizeFunction INSTANCE = new SizeFunction();

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            if (obj == null) {
                return -1;
            }
            if (obj instanceof Collection) {
                return Integer.valueOf(((Collection) obj).size());
            }
            if (obj.getClass().isArray()) {
                return Integer.valueOf(Array.getLength(obj));
            }
            if (obj instanceof Map) {
                return Integer.valueOf(((Map) obj).size());
            }
            if (obj instanceof JSONPath.Sequence) {
                return Integer.valueOf(((JSONPath.Sequence) obj).values.size());
            }
            return 1;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class TypeFunction implements Function {
        static final TypeFunction INSTANCE = new TypeFunction();

        @Override // java.util.function.Function
        public Object apply(Object obj) {
            return JSONPathFunction.type(obj);
        }
    }

    public JSONPathFunction(Function function) {
        this.function = function;
    }

    public static Object abs(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            return iIntValue < 0 ? Integer.valueOf(-iIntValue) : obj;
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            return jLongValue < 0 ? Long.valueOf(-jLongValue) : obj;
        }
        if (obj instanceof Byte) {
            byte bByteValue = ((Byte) obj).byteValue();
            return bByteValue < 0 ? Byte.valueOf((byte) (-bByteValue)) : obj;
        }
        if (obj instanceof Short) {
            short sShortValue = ((Short) obj).shortValue();
            return sShortValue < 0 ? Short.valueOf((short) (-sShortValue)) : obj;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            return dDoubleValue < 0.0d ? Double.valueOf(-dDoubleValue) : obj;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            return fFloatValue < 0.0f ? Float.valueOf(-fFloatValue) : obj;
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).abs();
        }
        if (obj instanceof BigInteger) {
            return ((BigInteger) obj).abs();
        }
        if (!(obj instanceof List)) {
            throw new JSONException("abs not support " + obj);
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            jSONArray.add(abs(list.get(i)));
        }
        return jSONArray;
    }

    public static Object ceil(Object obj) {
        if (obj instanceof Double) {
            return Double.valueOf(Math.ceil(((Double) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return Double.valueOf(Math.ceil(((Float) obj).floatValue()));
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).setScale(0, RoundingMode.CEILING);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof Double) {
                    list.set(i, Double.valueOf(Math.ceil(((Double) obj2).doubleValue())));
                } else if (obj2 instanceof Float) {
                    list.set(i, Double.valueOf(Math.ceil(((Float) obj2).floatValue())));
                } else if (obj2 instanceof BigDecimal) {
                    list.set(i, ((BigDecimal) obj2).setScale(0, RoundingMode.CEILING));
                }
            }
        }
        return obj;
    }

    public static Object exists(Object obj) {
        return Boolean.valueOf(obj != null);
    }

    public static Object first(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONPath.Sequence) {
            obj = ((JSONPath.Sequence) obj).values;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        if (obj instanceof Collection) {
            Collection collection = (Collection) obj;
            if (collection.isEmpty()) {
                return null;
            }
            return collection.iterator().next();
        }
        if (!obj.getClass().isArray()) {
            return obj;
        }
        if (Array.getLength(obj) == 0) {
            return null;
        }
        return Array.get(obj, 0);
    }

    public static Object floor(Object obj) {
        if (obj instanceof Double) {
            return Double.valueOf(Math.floor(((Double) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return Double.valueOf(Math.floor(((Float) obj).floatValue()));
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).setScale(0, RoundingMode.FLOOR);
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof Double) {
                    list.set(i, Double.valueOf(Math.floor(((Double) obj2).doubleValue())));
                } else if (obj2 instanceof Float) {
                    list.set(i, Double.valueOf(Math.floor(((Float) obj2).floatValue())));
                } else if (obj2 instanceof BigDecimal) {
                    list.set(i, ((BigDecimal) obj2).setScale(0, RoundingMode.FLOOR));
                }
            }
        }
        return obj;
    }

    public static Object last(Object obj) {
        Object next = null;
        if (obj == null) {
            return null;
        }
        if (obj instanceof JSONPath.Sequence) {
            obj = ((JSONPath.Sequence) obj).values;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = list.size();
            if (size == 0) {
                return null;
            }
            return list.get(size - 1);
        }
        if (!(obj instanceof Collection)) {
            if (!obj.getClass().isArray()) {
                return obj;
            }
            int length = Array.getLength(obj);
            if (length == 0) {
                return null;
            }
            return Array.get(obj, length - 1);
        }
        Collection collection = (Collection) obj;
        if (collection.isEmpty()) {
            return null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object lower(Object obj) {
        if (obj == null) {
            return null;
        }
        return (obj instanceof String ? (String) obj : obj.toString()).toLowerCase();
    }

    public static Object negative(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Integer) obj).intValue();
            return iIntValue == Integer.MIN_VALUE ? Long.valueOf(-iIntValue) : Integer.valueOf(-iIntValue);
        }
        if (obj instanceof Long) {
            long jLongValue = ((Long) obj).longValue();
            return jLongValue == Long.MIN_VALUE ? BigInteger.valueOf(jLongValue).negate() : Long.valueOf(-jLongValue);
        }
        if (obj instanceof Byte) {
            byte bByteValue = ((Byte) obj).byteValue();
            return bByteValue == -128 ? Integer.valueOf(-bByteValue) : Byte.valueOf((byte) (-bByteValue));
        }
        if (obj instanceof Short) {
            short sShortValue = ((Short) obj).shortValue();
            return sShortValue == Short.MIN_VALUE ? Integer.valueOf(-sShortValue) : Short.valueOf((short) (-sShortValue));
        }
        if (obj instanceof Double) {
            return Double.valueOf(-((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return Float.valueOf(-((Float) obj).floatValue());
        }
        if (obj instanceof BigDecimal) {
            return ((BigDecimal) obj).negate();
        }
        if (obj instanceof BigInteger) {
            return ((BigInteger) obj).negate();
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        JSONArray jSONArray = new JSONArray(list.size());
        for (int i = 0; i < list.size(); i++) {
            jSONArray.add(negative(list.get(i)));
        }
        return jSONArray;
    }

    public static Object trim(Object obj) {
        if (obj == null) {
            return null;
        }
        return (obj instanceof String ? (String) obj : obj.toString()).trim();
    }

    public static String type(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (obj instanceof Collection) {
            return "array";
        }
        if (obj instanceof Number) {
            return "number";
        }
        if (obj instanceof Boolean) {
            return "boolean";
        }
        return ((obj instanceof String) || (obj instanceof UUID) || (obj instanceof Enum)) ? "string" : "object";
    }

    public static Object upper(Object obj) {
        if (obj == null) {
            return null;
        }
        return (obj instanceof String ? (String) obj : obj.toString()).toUpperCase();
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void accept(JSONReader jSONReader, JSONPath.Context context) {
        if (context.parent == null) {
            context.root = jSONReader.readAny();
            context.eval = true;
        }
        eval(context);
    }

    @Override // com.alibaba.fastjson2.JSONPathSegment
    public void eval(JSONPath.Context context) {
        JSONPath.Context context2 = context.parent;
        context.value = this.function.apply(context2 == null ? context.root : context2.value);
    }
}
