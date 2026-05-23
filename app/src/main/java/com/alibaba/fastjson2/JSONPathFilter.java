package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.alibaba.fastjson2.writer.ObjectWriterAdapter;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import p000.AbstractC1194;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
abstract class JSONPathFilter extends JSONPathSegment implements JSONPathSegment.EvalSegment {
    private boolean and = true;

    /* JADX INFO: compiled from: obf */
    public static final class EndsWithSegment extends NameFilter {
        final String prefix;

        public EndsWithSegment(String str, long j, String str2) {
            super(str, j);
            this.prefix = str2;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            String string = obj.toString();
            return true && string.endsWith(this.prefix);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class GroupFilter extends JSONPathSegment implements JSONPathSegment.EvalSegment {
        final List<JSONPathFilter> filters;

        public GroupFilter(List<JSONPathFilter> list) {
            this.filters = list;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (context.parent == null) {
                context.root = jSONReader.readAny();
            }
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            List<JSONPathFilter> arrayList = new ArrayList();
            List<JSONPathFilter> list = this.filters;
            if (list != null) {
                arrayList = (List) list.stream().sorted(Comparator.comparing(new C0015(0))).collect(Collectors.toList());
            }
            boolean z = false;
            if (!(obj instanceof List)) {
                Iterator it = arrayList.iterator();
                boolean z2 = false;
                while (true) {
                    if (!it.hasNext()) {
                        z = z2;
                        break;
                    }
                    JSONPathFilter jSONPathFilter = (JSONPathFilter) it.next();
                    boolean zIsAnd = jSONPathFilter.isAnd();
                    boolean zApply = jSONPathFilter.apply(context, obj);
                    if (!zIsAnd) {
                        if (zApply) {
                            z = true;
                            break;
                        }
                        z2 = false;
                    } else if (!zApply) {
                        break;
                    } else {
                        z2 = true;
                    }
                }
                if (z) {
                    context.value = obj;
                }
                context.eval = true;
                return;
            }
            List list2 = (List) obj;
            JSONArray jSONArray = new JSONArray(list2.size());
            for (int i = 0; i < list2.size(); i++) {
                Object obj2 = list2.get(i);
                boolean z3 = false;
                for (JSONPathFilter jSONPathFilter2 : arrayList) {
                    boolean zIsAnd2 = jSONPathFilter2.isAnd();
                    boolean zApply2 = jSONPathFilter2.apply(context, obj2);
                    if (zIsAnd2) {
                        if (!zApply2) {
                            z3 = false;
                            break;
                        }
                        z3 = true;
                    } else {
                        if (zApply2) {
                            z3 = true;
                            break;
                        }
                        z3 = false;
                    }
                }
                if (z3) {
                    jSONArray.add(obj2);
                }
            }
            context.value = jSONArray;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameArrayOpSegment extends NameFilter {
        final JSONArray array;
        final Operator operator;

        public NameArrayOpSegment(String str, long j, String[] strArr, long[] jArr, Function function, Operator operator, JSONArray jSONArray) {
            super(str, j, strArr, jArr, function);
            this.operator = operator;
            this.array = jSONArray;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            if (this.operator == Operator.EQ) {
                return this.array.equals(obj);
            }
            throw new JSONException("not support operator : " + this.operator);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameDecimalOpSegment extends NameFilter {
        final Operator operator;
        final BigDecimal value;

        public NameDecimalOpSegment(String str, long j, Operator operator, BigDecimal bigDecimal) {
            super(str, j);
            this.operator = operator;
            this.value = bigDecimal;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            BigDecimal bigDecimalValueOf;
            if (obj == null) {
                return false;
            }
            if (obj instanceof Boolean) {
                bigDecimalValueOf = ((Boolean) obj).booleanValue() ? BigDecimal.ONE : BigDecimal.ZERO;
            } else if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                bigDecimalValueOf = BigDecimal.valueOf(((Number) obj).longValue());
            } else if (obj instanceof BigDecimal) {
                bigDecimalValueOf = (BigDecimal) obj;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new UnsupportedOperationException();
                }
                bigDecimalValueOf = new BigDecimal((BigInteger) obj);
            }
            int iCompareTo = bigDecimalValueOf.compareTo(this.value);
            int iOrdinal = this.operator.ordinal();
            if (iOrdinal == 0) {
                return iCompareTo == 0;
            }
            if (iOrdinal == 1) {
                return iCompareTo != 0;
            }
            if (iOrdinal == 2) {
                return iCompareTo > 0;
            }
            if (iOrdinal == 3) {
                return iCompareTo >= 0;
            }
            if (iOrdinal == 4) {
                return iCompareTo < 0;
            }
            if (iOrdinal == 5) {
                return iCompareTo <= 0;
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return this.operator == Operator.NE;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameDoubleOpSegment extends NameFilter {
        final Operator operator;
        final double value;

        public NameDoubleOpSegment(String str, long j, Operator operator, Double d) {
            super(str, j);
            this.operator = operator;
            this.value = d.doubleValue();
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            Double dValueOf;
            if (obj == null) {
                return false;
            }
            if (obj instanceof Boolean) {
                dValueOf = Double.valueOf(((Boolean) obj).booleanValue() ? 1.0d : 0.0d);
            } else {
                if (!(obj instanceof Number)) {
                    throw new UnsupportedOperationException();
                }
                dValueOf = Double.valueOf(((Number) obj).doubleValue());
            }
            int iCompareTo = dValueOf.compareTo(Double.valueOf(this.value));
            int iOrdinal = this.operator.ordinal();
            if (iOrdinal == 0) {
                return iCompareTo == 0;
            }
            if (iOrdinal == 1) {
                return iCompareTo != 0;
            }
            if (iOrdinal == 2) {
                return iCompareTo > 0;
            }
            if (iOrdinal == 3) {
                return iCompareTo >= 0;
            }
            if (iOrdinal == 4) {
                return iCompareTo < 0;
            }
            if (iOrdinal == 5) {
                return iCompareTo <= 0;
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return this.operator == Operator.NE;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameExistsFilter extends JSONPathFilter {
        final String name;
        final long nameHashCode;

        public NameExistsFilter(String str, long j) {
            this.name = str;
            this.nameHashCode = j;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter
        public boolean apply(JSONPath.Context context, Object obj) {
            if (obj instanceof Map) {
                return ((Map) obj).containsKey(this.name);
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    if (obj2 instanceof Map) {
                        Map map = (Map) obj2;
                        if (map.containsKey(this.name) && map.get(this.name) != null) {
                            jSONArray.add(obj2);
                        }
                    }
                    i++;
                }
                context.value = jSONArray;
                return;
            }
            if (obj instanceof Map) {
                if (((Map) obj).get(this.name) == null) {
                    obj = null;
                }
                context.value = obj;
                return;
            }
            if (!(obj instanceof JSONPath.Sequence)) {
                throw new UnsupportedOperationException();
            }
            List list2 = ((JSONPath.Sequence) obj).values;
            while (i < list2.size()) {
                Object obj3 = list2.get(i);
                if (obj3 instanceof Map) {
                    Map map2 = (Map) obj3;
                    if (map2.containsKey(this.name) && map2.get(this.name) != null) {
                        jSONArray.add(obj3);
                    }
                }
                i++;
            }
            if (context.next != null) {
                context.value = new JSONPath.Sequence(jSONArray);
            } else {
                context.value = jSONArray;
            }
        }

        public String toString() {
            return "?" + this.name;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameIntBetweenSegment extends NameFilter {
        private final long begin;
        private final long end;
        private final boolean not;

        public NameIntBetweenSegment(String str, long j, long j2, long j3, boolean z) {
            super(str, j);
            this.begin = j2;
            this.end = j3;
            this.not = z;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            boolean z;
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue < this.begin || jLongValue > this.end) {
                    return this.not;
                }
                z = this.not;
            } else if ((obj instanceof Float) || (obj instanceof Double)) {
                double dDoubleValue = ((Number) obj).doubleValue();
                if (dDoubleValue < this.begin || dDoubleValue > this.end) {
                    return this.not;
                }
                z = this.not;
            } else if (obj instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                int iCompareTo = bigDecimal.compareTo(BigDecimal.valueOf(this.begin));
                int iCompareTo2 = bigDecimal.compareTo(BigDecimal.valueOf(this.end));
                if (iCompareTo < 0 || iCompareTo2 > 0) {
                    return this.not;
                }
                z = this.not;
            } else {
                if (!(obj instanceof BigInteger)) {
                    return this.not;
                }
                BigInteger bigInteger = (BigInteger) obj;
                int iCompareTo3 = bigInteger.compareTo(BigInteger.valueOf(this.begin));
                int iCompareTo4 = bigInteger.compareTo(BigInteger.valueOf(this.end));
                if (iCompareTo3 < 0 || iCompareTo4 > 0) {
                    return this.not;
                }
                z = this.not;
            }
            return !z;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return this.not;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameIntInSegment extends NameFilter {
        private final boolean not;
        private final long[] values;

        public NameIntInSegment(String str, long j, String[] strArr, long[] jArr, Function function, long[] jArr2, boolean z) {
            super(str, j, strArr, jArr, function);
            this.values = jArr2;
            this.not = z;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            boolean z;
            int i = 0;
            if ((obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                long jLongValue = ((Number) obj).longValue();
                long[] jArr = this.values;
                int length = jArr.length;
                while (i < length) {
                    if (jArr[i] == jLongValue) {
                        z = this.not;
                    } else {
                        i++;
                    }
                }
                return this.not;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                double dDoubleValue = ((Number) obj).doubleValue();
                long[] jArr2 = this.values;
                int length2 = jArr2.length;
                while (i < length2) {
                    if (jArr2[i] == dDoubleValue) {
                        z = this.not;
                    } else {
                        i++;
                    }
                }
                return this.not;
            }
            if (obj instanceof BigDecimal) {
                BigDecimal bigDecimal = (BigDecimal) obj;
                long jLongValue2 = bigDecimal.longValue();
                long[] jArr3 = this.values;
                int length3 = jArr3.length;
                while (i < length3) {
                    long j = jArr3[i];
                    if (j == jLongValue2 && bigDecimal.compareTo(BigDecimal.valueOf(j)) == 0) {
                        z = this.not;
                    } else {
                        i++;
                    }
                }
                return this.not;
            }
            if (!(obj instanceof BigInteger)) {
                return this.not;
            }
            BigInteger bigInteger = (BigInteger) obj;
            long jLongValue3 = bigInteger.longValue();
            long[] jArr4 = this.values;
            int length4 = jArr4.length;
            while (i < length4) {
                long j2 = jArr4[i];
                if (j2 == jLongValue3 && bigInteger.equals(BigInteger.valueOf(j2))) {
                    z = this.not;
                } else {
                    i++;
                }
            }
            return this.not;
            return !z;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return this.not;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameIntOpSegment extends NameFilter {
        final Operator operator;
        final long value;

        public NameIntOpSegment(String str, long j, String[] strArr, long[] jArr, Function function, Operator operator, long j2) {
            super(str, j, strArr, jArr, function);
            this.operator = operator;
            this.value = j2;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            long jLongValue;
            int iCompareTo;
            boolean z = obj instanceof Boolean;
            if (z || (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long)) {
                if (z) {
                    jLongValue = ((Boolean) obj).booleanValue() ? 1L : 0L;
                } else {
                    jLongValue = ((Number) obj).longValue();
                }
                int iOrdinal = this.operator.ordinal();
                if (iOrdinal == 0) {
                    return jLongValue == this.value;
                }
                if (iOrdinal == 1) {
                    return jLongValue != this.value;
                }
                if (iOrdinal == 2) {
                    return jLongValue > this.value;
                }
                if (iOrdinal == 3) {
                    return jLongValue >= this.value;
                }
                if (iOrdinal == 4) {
                    return jLongValue < this.value;
                }
                if (iOrdinal == 5) {
                    return jLongValue <= this.value;
                }
                throw new UnsupportedOperationException();
            }
            if (obj instanceof BigDecimal) {
                iCompareTo = ((BigDecimal) obj).compareTo(BigDecimal.valueOf(this.value));
            } else if (obj instanceof BigInteger) {
                iCompareTo = ((BigInteger) obj).compareTo(BigInteger.valueOf(this.value));
            } else if (obj instanceof Float) {
                iCompareTo = ((Float) obj).compareTo(Float.valueOf(this.value));
            } else if (obj instanceof Double) {
                iCompareTo = ((Double) obj).compareTo(Double.valueOf(this.value));
            } else {
                if (!(obj instanceof String)) {
                    throw new UnsupportedOperationException();
                }
                String str = (String) obj;
                if (IOUtils.isNumber(str)) {
                    try {
                        iCompareTo = Long.compare(Long.parseLong(str), this.value);
                    } catch (Exception unused) {
                        iCompareTo = str.compareTo(Long.toString(this.value));
                    }
                } else {
                    iCompareTo = str.compareTo(Long.toString(this.value));
                }
            }
            int iOrdinal2 = this.operator.ordinal();
            if (iOrdinal2 == 0) {
                return iCompareTo == 0;
            }
            if (iOrdinal2 == 1) {
                return iCompareTo != 0;
            }
            if (iOrdinal2 == 2) {
                return iCompareTo > 0;
            }
            if (iOrdinal2 == 3) {
                return iCompareTo >= 0;
            }
            if (iOrdinal2 == 4) {
                return iCompareTo < 0;
            }
            if (iOrdinal2 == 5) {
                return iCompareTo <= 0;
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return this.operator == Operator.NE;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            if (!(obj2 instanceof List)) {
                throw new JSONException("UnsupportedOperation ");
            }
            List list = (List) obj2;
            for (int i = 0; i < list.size(); i++) {
                if (apply(context, list.get(i))) {
                    list.set(i, obj);
                }
            }
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void setCallback(JSONPath.Context context, BiFunction biFunction) {
            Object objApply;
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException("UnsupportedOperation ");
            }
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                Object obj2 = list.get(i);
                if (apply(context, obj2) && (objApply = biFunction.apply(list, obj2)) != obj2) {
                    list.set(i, objApply);
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("[?(");
            Object obj = this.fieldName2;
            if (obj == null) {
                obj = "@";
            }
            sb.append(obj);
            sb.append('.');
            sb.append(this.fieldName);
            sb.append(' ');
            sb.append(this.operator);
            sb.append(' ');
            sb.append(this.value);
            sb.append(")]");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameIsNull extends NameFilter {
        public NameIsNull(String str, long j, String[] strArr, long[] jArr, Function function) {
            super(str, j, strArr, jArr, function);
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            Function function = this.function;
            if (function != null) {
                obj = function.apply(obj);
            }
            return obj == null;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameLongContainsSegment extends NameFilter {
        private final boolean not;
        private final long[] values;

        public NameLongContainsSegment(String str, long j, String[] strArr, long[] jArr, long[] jArr2, boolean z) {
            super(str, j, strArr, jArr, null);
            this.values = jArr2;
            this.not = z;
        }

        /* JADX WARN: Code duplicated, block: B:37:0x0074  */
        /* JADX WARN: Code duplicated, block: B:55:0x0078 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:58:0x0012 A[SYNTHETIC] */
        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            BigInteger bigInteger;
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                for (long j : this.values) {
                    Iterator it = collection.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if ((((next instanceof Byte) || (next instanceof Short) || (next instanceof Integer) || (next instanceof Long)) && ((Number) next).longValue() == j) || (((next instanceof Float) && j == ((Float) next).floatValue()) || ((next instanceof Double) && j == ((Double) next).doubleValue()))) {
                                break;
                            }
                            if (next instanceof BigDecimal) {
                                BigDecimal bigDecimal = (BigDecimal) next;
                                if (j == bigDecimal.longValue() && bigDecimal.compareTo(BigDecimal.valueOf(j)) == 0) {
                                    break;
                                }
                                if (false) {
                                    bigInteger = (BigInteger) next;
                                    if (j == bigInteger.longValue() && bigInteger.equals(BigInteger.valueOf(j))) {
                                        break;
                                    }
                                }
                            } else if (next instanceof BigInteger) {
                                bigInteger = (BigInteger) next;
                                if (j == bigInteger.longValue()) {
                                    continue;
                                }
                            }
                        }
                    }
                }
                return !this.not;
            }
            return this.not;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameMatchFilter extends NameFilter {
        final String[] containsValues;
        final String endsWithValue;
        final int minLength;
        final boolean not;
        final String startsWithValue;

        public NameMatchFilter(String str, long j, String str2, String str3, String[] strArr, boolean z) {
            super(str, j);
            this.startsWithValue = str2;
            this.endsWithValue = str3;
            this.containsValues = strArr;
            this.not = z;
            int length = str2 != null ? str2.length() : 0;
            length = str3 != null ? length + str3.length() : length;
            if (strArr != null) {
                for (String str4 : strArr) {
                    length += str4.length();
                }
            }
            this.minLength = length;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            int length;
            if (!(obj instanceof String)) {
                return false;
            }
            String str = (String) obj;
            if (str.length() < this.minLength) {
                return this.not;
            }
            String str2 = this.startsWithValue;
            if (str2 == null) {
                length = 0;
            } else {
                if (!str.startsWith(str2)) {
                    return this.not;
                }
                length = this.startsWithValue.length();
            }
            String[] strArr = this.containsValues;
            if (strArr != null) {
                for (String str3 : strArr) {
                    int iIndexOf = str.indexOf(str3, length);
                    if (iIndexOf == -1) {
                        return this.not;
                    }
                    length = iIndexOf + str3.length();
                }
            }
            String str4 = this.endsWithValue;
            return (str4 == null || str.endsWith(str4)) ? !this.not : this.not;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameObjectOpSegment extends NameFilter {
        final JSONObject object;
        final Operator operator;

        public NameObjectOpSegment(String str, long j, String[] strArr, long[] jArr, Function function, Operator operator, JSONObject jSONObject) {
            super(str, j, strArr, jArr, function);
            this.operator = operator;
            this.object = jSONObject;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            if (this.operator == Operator.EQ) {
                return this.object.equals(obj);
            }
            throw new JSONException("not support operator : " + this.operator);
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameRLikeSegment extends NameFilter {
        final boolean not;
        final Pattern pattern;

        public NameRLikeSegment(String str, long j, Pattern pattern, boolean z) {
            super(str, j);
            this.pattern = pattern;
            this.not = z;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            boolean zMatches = this.pattern.matcher(obj.toString()).matches();
            return this.not ? !zMatches : zMatches;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameStringContainsSegment extends NameFilter {
        private final boolean not;
        private final String[] values;

        public NameStringContainsSegment(String str, long j, String[] strArr, long[] jArr, String[] strArr2, boolean z) {
            super(str, j, strArr, jArr, null);
            this.values = strArr2;
            this.not = z;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            if (obj instanceof Collection) {
                Collection collection = (Collection) obj;
                for (String str : this.values) {
                    if (collection.contains(str)) {
                    }
                }
                return !this.not;
            }
            return this.not;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameStringInSegment extends NameFilter {
        private final boolean not;
        private final String[] values;

        public NameStringInSegment(String str, long j, String[] strArr, boolean z) {
            super(str, j);
            this.values = strArr;
            this.not = z;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            boolean z;
            for (String str : this.values) {
                if (str == obj) {
                    z = this.not;
                } else if (str != null && str.equals(obj)) {
                    z = this.not;
                }
                return !z;
            }
            return this.not;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return this.not;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameStringOpSegment extends NameFilter {
        final Operator operator;
        final String value;

        public NameStringOpSegment(String str, long j, String[] strArr, long[] jArr, Function function, Operator operator, String str2) {
            super(str, j, strArr, jArr, function);
            this.operator = operator;
            this.value = str2;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            if (!(obj instanceof String)) {
                return false;
            }
            String str = (String) obj;
            Operator operator = this.operator;
            if (operator == Operator.STARTS_WITH) {
                return str.startsWith(this.value);
            }
            if (operator == Operator.ENDS_WITH) {
                return str.endsWith(this.value);
            }
            int iCompareTo = str.compareTo(this.value);
            int iOrdinal = this.operator.ordinal();
            if (iOrdinal == 0) {
                return iCompareTo == 0;
            }
            if (iOrdinal == 1) {
                return iCompareTo != 0;
            }
            if (iOrdinal == 2) {
                return iCompareTo > 0;
            }
            if (iOrdinal == 3) {
                return iCompareTo >= 0;
            }
            if (iOrdinal == 4) {
                return iCompareTo < 0;
            }
            if (iOrdinal == 5) {
                return iCompareTo <= 0;
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean applyNull() {
            return this.operator == Operator.NE;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NamesExistsFilter extends JSONPathFilter {
        final long[] nameHashCodes;
        final String[] names;

        public NamesExistsFilter(List<String> list) {
            String[] strArr = (String[]) list.toArray(new String[0]);
            this.names = strArr;
            int length = strArr.length;
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = Fnv.hashCode64(this.names[i]);
            }
            this.nameHashCodes = jArr;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter
        public boolean apply(JSONPath.Context context, Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i = 0;
            Object obj2 = obj;
            while (true) {
                String[] strArr = this.names;
                if (i >= strArr.length) {
                    return;
                }
                String str = strArr[i];
                if (obj2 instanceof Map) {
                    obj2 = ((Map) obj2).get(str);
                    if (i == this.names.length - 1 || obj2 == null) {
                        if (obj2 == null) {
                            obj = null;
                        }
                        context.value = obj;
                        return;
                    }
                }
                i++;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("exists(@");
            for (int i = 0; i < this.names.length; i++) {
                sb.append('.');
                sb.append(this.names[i]);
            }
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: obf */
    public enum Operator {
        EQ,
        NE,
        GT,
        GE,
        LT,
        LE,
        LIKE,
        NOT_LIKE,
        RLIKE,
        NOT_RLIKE,
        IN,
        NOT_IN,
        BETWEEN,
        NOT_BETWEEN,
        AND,
        OR,
        REG_MATCH,
        STARTS_WITH,
        ENDS_WITH,
        CONTAINS,
        NOT_CONTAINS;

        @Override // java.lang.Enum
        public String toString() {
            switch (ordinal()) {
                case 0:
                    return "==";
                case 1:
                    return "!=";
                case 2:
                    return ">";
                case 3:
                    return ">=";
                case 4:
                    return "<";
                case 5:
                    return "<=";
                case 6:
                    return "like";
                case 7:
                    return "not like";
                case 8:
                    return "rlike";
                case 9:
                    return "not rlike";
                case 10:
                case 11:
                case 16:
                default:
                    return name();
                case 12 /* 12 */:
                    return "between";
                case 13:
                    return "not between";
                case 14 /* 14 */:
                    return "and";
                case 15:
                    return "or";
                case 17 /* 17 */:
                    return "starts with";
                case 18 /* 18 */:
                    return "ends with";
                case 19:
                    return "contains";
                case 20:
                    return "not contains";
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class RangeIndexSegmentFilter extends JSONPathFilter {
        final JSONPathSegment.RangeIndexSegment expr;
        final Operator operator;
        final Object value;

        public RangeIndexSegmentFilter(JSONPathSegment.RangeIndexSegment rangeIndexSegment, Operator operator, Object obj) {
            this.expr = rangeIndexSegment;
            this.operator = operator;
            this.value = obj;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            throw new JSONException(AbstractC1194.m2782(RangeIndexSegmentFilter.class, "UnsupportedOperation "));
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter
        public boolean apply(JSONPath.Context context, Object obj) {
            if (obj == null) {
                return false;
            }
            JSONPath.Context context2 = new JSONPath.Context(null, null, this.expr, null, 0L);
            context2.root = obj;
            this.expr.eval(context2);
            List list = (List) context2.value;
            for (int i = 0; i < list.size(); i++) {
                int iCompare = TypeUtils.compare(list.get(i), this.value);
                int iOrdinal = this.operator.ordinal();
                if (iOrdinal == 0) {
                    if (iCompare != 0) {
                        return false;
                    }
                } else if (iOrdinal == 1) {
                    if (iCompare == 0) {
                        return false;
                    }
                } else if (iOrdinal == 2) {
                    if (iCompare <= 0) {
                        return false;
                    }
                } else if (iOrdinal == 3) {
                    if (iCompare < 0) {
                        return false;
                    }
                } else if (iOrdinal != 4) {
                    if (iOrdinal != 5) {
                        throw new UnsupportedOperationException();
                    }
                    if (iCompare > 0) {
                        return false;
                    }
                } else {
                    if (iCompare >= 0) {
                        return false;
                    }
                }
            }
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("UnsupportedOperation ")));
            }
            List list = (List) obj;
            JSONArray jSONArray = new JSONArray(list.size());
            for (int i = 0; i < list.size(); i++) {
                Object obj2 = list.get(i);
                if (apply(context, obj2)) {
                    jSONArray.add(obj2);
                }
            }
            context.value = jSONArray;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class Segment2Filter extends JSONPathFilter {
        final JSONPathSegment left;
        final Operator operator;
        final JSONPathSegment right;

        public Segment2Filter(JSONPathSegment jSONPathSegment, Operator operator, JSONPathSegment jSONPathSegment2) {
            this.left = jSONPathSegment;
            this.operator = operator;
            this.right = jSONPathSegment2;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            throw new JSONException(AbstractC1194.m2782(Segment2Filter.class, "UnsupportedOperation "));
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter
        public boolean apply(JSONPath.Context context, Object obj) {
            if (obj == null) {
                return false;
            }
            JSONPath.Context context2 = new JSONPath.Context(null, null, this.left, null, 0L);
            context2.root = obj;
            this.left.eval(context2);
            Object obj2 = context2.value;
            JSONPath.Context context3 = new JSONPath.Context(null, null, this.right, null, 0L);
            context3.root = obj;
            this.right.eval(context3);
            int iCompare = TypeUtils.compare(obj2, context3.value);
            int iOrdinal = this.operator.ordinal();
            if (iOrdinal == 0) {
                return iCompare == 0;
            }
            if (iOrdinal == 1) {
                return iCompare != 0;
            }
            if (iOrdinal == 2) {
                return iCompare > 0;
            }
            if (iOrdinal == 3) {
                return iCompare >= 0;
            }
            if (iOrdinal == 4) {
                return iCompare < 0;
            }
            if (iOrdinal == 5) {
                return iCompare <= 0;
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("UnsupportedOperation ")));
            }
            List list = (List) obj;
            JSONArray jSONArray = new JSONArray(list.size());
            for (int i = 0; i < list.size(); i++) {
                Object obj2 = list.get(i);
                if (apply(context, obj2)) {
                    jSONArray.add(obj2);
                }
            }
            context.value = jSONArray;
            context.eval = true;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class SegmentFilter extends JSONPathFilter {
        final JSONPathSegment expr;
        final Operator operator;
        final Object value;

        public SegmentFilter(JSONPathSegment jSONPathSegment, Operator operator, Object obj) {
            this.expr = jSONPathSegment;
            this.operator = operator;
            this.value = obj;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void accept(JSONReader jSONReader, JSONPath.Context context) {
            throw new JSONException(AbstractC1194.m2782(SegmentFilter.class, "UnsupportedOperation "));
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter
        public boolean apply(JSONPath.Context context, Object obj) {
            if (obj == null) {
                return false;
            }
            JSONPath.Context context2 = new JSONPath.Context(null, null, this.expr, null, 0L);
            context2.root = obj;
            this.expr.eval(context2);
            int iCompare = TypeUtils.compare(context2.value, this.value);
            int iOrdinal = this.operator.ordinal();
            if (iOrdinal == 0) {
                return iCompare == 0;
            }
            if (iOrdinal == 1) {
                return iCompare != 0;
            }
            if (iOrdinal == 2) {
                return iCompare > 0;
            }
            if (iOrdinal == 3) {
                return iCompare >= 0;
            }
            if (iOrdinal == 4) {
                return iCompare < 0;
            }
            if (iOrdinal == 5) {
                return iCompare <= 0;
            }
            throw new UnsupportedOperationException();
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException(AbstractC1194.m2783(obj, new StringBuilder("UnsupportedOperation ")));
            }
            List list = (List) obj;
            JSONArray jSONArray = new JSONArray(list.size());
            for (int i = 0; i < list.size(); i++) {
                Object obj2 = list.get(i);
                if (apply(context, obj2)) {
                    jSONArray.add(obj2);
                }
            }
            context.value = jSONArray;
            context.eval = true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException(AbstractC1194.m2782(SegmentFilter.class, "UnsupportedOperation "));
            }
            List list = (List) obj;
            for (int size = list.size() - 1; size >= 0; size--) {
                if (apply(context, list.get(size))) {
                    list.remove(size);
                }
            }
            return true;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public void set(JSONPath.Context context, Object obj) {
            JSONPath.Context context2 = context.parent;
            Object obj2 = context2 == null ? context.root : context2.value;
            if (!(obj2 instanceof List)) {
                throw new JSONException("UnsupportedOperation ");
            }
            List list = (List) obj2;
            for (int i = 0; i < list.size(); i++) {
                if (apply(context, list.get(i))) {
                    list.set(i, obj);
                }
            }
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class StartsWithSegment extends NameFilter {
        final String prefix;

        public StartsWithSegment(String str, long j, String str2) {
            super(str, j);
            this.prefix = str2;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            String string = obj.toString();
            return true && string.startsWith(this.prefix);
        }
    }

    public abstract boolean apply(JSONPath.Context context, Object obj);

    public boolean isAnd() {
        return this.and;
    }

    public JSONPathFilter setAnd(boolean z) {
        this.and = z;
        return this;
    }

    /* JADX INFO: compiled from: obf */
    public static abstract class NameFilter extends JSONPathFilter {
        final String fieldName;
        final String[] fieldName2;
        final long fieldNameNameHash;
        final long[] fieldNameNameHash2;
        final Function function;
        boolean includeArray;

        public NameFilter(String str, long j) {
            this.includeArray = true;
            this.fieldName = str;
            this.fieldNameNameHash = j;
            this.fieldName2 = null;
            this.fieldNameNameHash2 = null;
            this.function = null;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public final void accept(JSONReader jSONReader, JSONPath.Context context) {
            if (context.parent == null) {
                context.root = jSONReader.readAny();
            }
            eval(context);
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter
        public boolean apply(JSONPath.Context context, Object obj) {
            FieldWriter fieldWriter;
            FieldWriter fieldWriter2;
            if (obj == null) {
                return false;
            }
            JSONWriter.Context writerContext = context.path.getWriterContext();
            if (obj instanceof Map) {
                String str = this.fieldName;
                if (str != null) {
                    obj = ((Map) obj).get(str);
                }
                if (obj == null) {
                    return applyNull();
                }
                if (this.fieldName2 != null) {
                    int i = 0;
                    while (true) {
                        String[] strArr = this.fieldName2;
                        if (i >= strArr.length) {
                            break;
                        }
                        String str2 = strArr[i];
                        if (obj instanceof Map) {
                            obj = ((Map) obj).get(str2);
                        } else {
                            ObjectWriter objectWriter = writerContext.getObjectWriter(obj.getClass());
                            if (!(objectWriter instanceof ObjectWriterAdapter) || (fieldWriter2 = objectWriter.getFieldWriter(this.fieldNameNameHash2[i])) == null) {
                                return false;
                            }
                            obj = fieldWriter2.getFieldValue(obj);
                        }
                        if (obj == null) {
                            return this instanceof NameIsNull;
                        }
                        i++;
                    }
                }
                Function function = this.function;
                if (function != null) {
                    obj = function.apply(obj);
                }
                return apply(obj);
            }
            ObjectWriter objectWriter2 = writerContext.getObjectWriter(obj.getClass());
            if (!(objectWriter2 instanceof ObjectWriterAdapter)) {
                Function function2 = this.function;
                if (function2 != null) {
                    return apply(function2.apply(obj));
                }
                if (this.fieldName == null) {
                    return apply(obj);
                }
                return false;
            }
            Object fieldValue = objectWriter2.getFieldWriter(this.fieldNameNameHash).getFieldValue(obj);
            if (fieldValue == null) {
                return false;
            }
            if (this.fieldName2 != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr2 = this.fieldName2;
                    if (i2 >= strArr2.length) {
                        break;
                    }
                    String str3 = strArr2[i2];
                    if (fieldValue instanceof Map) {
                        fieldValue = ((Map) fieldValue).get(str3);
                    } else {
                        ObjectWriter objectWriter3 = writerContext.getObjectWriter(fieldValue.getClass());
                        if (!(objectWriter3 instanceof ObjectWriterAdapter) || (fieldWriter = objectWriter3.getFieldWriter(this.fieldNameNameHash2[i2])) == null) {
                            return false;
                        }
                        fieldValue = fieldWriter.getFieldValue(fieldValue);
                    }
                    if (fieldValue == null) {
                        return false;
                    }
                    i2++;
                }
            }
            Function function3 = this.function;
            if (function3 != null) {
                fieldValue = function3.apply(fieldValue);
            }
            return apply(fieldValue);
        }

        public abstract boolean apply(Object obj);

        public boolean applyNull() {
            return false;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public final void eval(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            int i = 0;
            if (obj instanceof List) {
                List list = (List) obj;
                JSONArray jSONArray = new JSONArray(list.size());
                while (i < list.size()) {
                    Object obj2 = list.get(i);
                    if (apply(context, obj2)) {
                        jSONArray.add(obj2);
                    }
                    i++;
                }
                context.value = jSONArray;
                context.eval = true;
                return;
            }
            if (obj instanceof Object[]) {
                Object[] objArr = (Object[]) obj;
                JSONArray jSONArray2 = new JSONArray(objArr.length);
                int length = objArr.length;
                while (i < length) {
                    Object obj3 = objArr[i];
                    if (apply(context, obj3)) {
                        jSONArray2.add(obj3);
                    }
                    i++;
                }
                context.value = jSONArray2;
                context.eval = true;
                return;
            }
            if (!(obj instanceof JSONPath.Sequence)) {
                if (apply(context, obj)) {
                    context.value = obj;
                    context.eval = true;
                    return;
                }
                return;
            }
            JSONArray jSONArray3 = new JSONArray();
            for (Object obj4 : ((JSONPath.Sequence) obj).values) {
                if (this.includeArray && (obj4 instanceof Collection)) {
                    for (Object obj5 : (Collection) obj4) {
                        if (apply(context, obj5)) {
                            jSONArray3.add(obj5);
                        }
                    }
                } else if (apply(context, obj4)) {
                    jSONArray3.add(obj4);
                }
            }
            context.value = jSONArray3;
            context.eval = true;
        }

        public void excludeArray() {
            this.includeArray = false;
        }

        @Override // com.alibaba.fastjson2.JSONPathSegment
        public boolean remove(JSONPath.Context context) {
            JSONPath.Context context2 = context.parent;
            Object obj = context2 == null ? context.root : context2.value;
            if (!(obj instanceof List)) {
                throw new JSONException("UnsupportedOperation " + getClass());
            }
            List list = (List) obj;
            for (int size = list.size() - 1; size >= 0; size--) {
                if (apply(context, list.get(size))) {
                    list.remove(size);
                }
            }
            return true;
        }

        public NameFilter(String str, long j, String[] strArr, long[] jArr, Function function) {
            this.includeArray = true;
            this.fieldName = str;
            this.fieldNameNameHash = j;
            this.fieldName2 = strArr;
            this.fieldNameNameHash2 = jArr;
            this.function = function;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class NameName extends NameFilter {
        final String fieldName1;
        final long fieldNameName1Hash;

        public NameName(String str, long j, String str2, long j2) {
            super(str, j);
            this.fieldName1 = str2;
            this.fieldNameName1Hash = j2;
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter, com.alibaba.fastjson2.JSONPathFilter
        public boolean apply(JSONPath.Context context, Object obj) {
            FieldWriter fieldWriter;
            Object fieldValue;
            Object obj2;
            if (obj == null) {
                return false;
            }
            JSONWriter.Context writerContext = context.path.getWriterContext();
            if (obj instanceof Map) {
                Map map = (Map) obj;
                obj2 = map.get(this.fieldName);
                fieldValue = map.get(this.fieldName1);
            } else {
                ObjectWriter objectWriter = writerContext.getObjectWriter(obj.getClass());
                if (!(objectWriter instanceof ObjectWriterAdapter) || (fieldWriter = objectWriter.getFieldWriter(this.fieldNameNameHash)) == null) {
                    return false;
                }
                Object fieldValue2 = fieldWriter.getFieldValue(obj);
                FieldWriter fieldWriter2 = objectWriter.getFieldWriter(this.fieldNameNameHash);
                if (fieldWriter2 == null) {
                    return false;
                }
                fieldValue = fieldWriter2.getFieldValue(obj);
                obj2 = fieldValue2;
            }
            return Objects.equals(obj2, fieldValue);
        }

        @Override // com.alibaba.fastjson2.JSONPathFilter.NameFilter
        public boolean apply(Object obj) {
            throw new JSONException("TODO");
        }
    }
}
