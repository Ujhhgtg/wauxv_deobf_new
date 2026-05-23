package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import com.alibaba.fastjson2.JSONPathFilter;
import com.alibaba.fastjson2.JSONPathFunction;
import com.alibaba.fastjson2.JSONPathSegment;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import com.umeng.analytics.pro.ek;
import com.umeng.analytics.pro.g;
import com.umeng.ccg.a;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
class JSONPathParser {
    boolean dollar;
    int filterNests;
    JSONPathSegment first;
    final JSONReader jsonReader;
    boolean lax;
    boolean negative;
    final String path;
    JSONPathSegment second;
    int segmentIndex;
    List<JSONPathSegment> segments;
    boolean strict;

    /* JADX INFO: compiled from: obf */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator;

        static {
            int[] iArr = new int[JSONPathFilter.Operator.values().length];
            $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator = iArr;
            try {
                iArr[JSONPathFilter.Operator.STARTS_WITH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.ENDS_WITH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.REG_MATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.RLIKE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.NOT_RLIKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.IN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.NOT_IN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.CONTAINS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.BETWEEN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson2$JSONPathFilter$Operator[JSONPathFilter.Operator.NOT_BETWEEN.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public JSONPathParser(String str) {
        this.path = str;
        JSONReader jSONReaderOf = JSONReader.of(str, JSONPath.PARSE_CONTEXT);
        this.jsonReader = jSONReaderOf;
        if (jSONReaderOf.ch == 'l' && jSONReaderOf.nextIfMatchIdent('l', 'a', 'x')) {
            this.lax = true;
        } else if (jSONReaderOf.ch == 's' && jSONReaderOf.nextIfMatchIdent('s', 't', 'r', 'i', 'c', 't')) {
            this.strict = true;
        }
        if (jSONReaderOf.ch == '-') {
            jSONReaderOf.next();
            this.negative = true;
        }
        if (jSONReaderOf.ch == '$') {
            jSONReaderOf.next();
            this.dollar = true;
        }
    }

    public static boolean isOperator(char c) {
        return c == '=' || c == '<' || c == '>' || c == '!';
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0216  */
    /* JADX WARN: Code duplicated, block: B:122:0x0282  */
    /* JADX WARN: Code duplicated, block: B:131:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x014d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0159  */
    /* JADX WARN: Code duplicated, block: B:69:0x0162  */
    /* JADX WARN: Code duplicated, block: B:71:0x0166  */
    /* JADX WARN: Code duplicated, block: B:73:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x017a  */
    /* JADX WARN: Code duplicated, block: B:76:0x0184  */
    /* JADX WARN: Code duplicated, block: B:79:0x018d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0193  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:93:0x01dd A[LOOP:3: B:91:0x01d7->B:93:0x01dd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:98:0x0204  */
    /* JADX WARN: Code duplicated, block: B:99:0x020e  */
    /* JADX WARN: Instruction removed from duplicated block: B:122:0x0282, please report this as an issue */
    private JSONPathSegment parseArrayAccess() {
        String string;
        ArrayList arrayList;
        JSONPathSegment multiNameSegment;
        int int32Value;
        JSONReader jSONReader;
        boolean zNextIfMatchIdent;
        ArrayList arrayList2;
        int[] iArr;
        JSONReader jSONReader2;
        this.jsonReader.next();
        JSONReader jSONReader3 = this.jsonReader;
        char c = jSONReader3.ch;
        if (c == '\"') {
            string = jSONReader3.readString();
            if (this.jsonReader.current() == ']') {
                multiNameSegment = new JSONPathSegmentName(string, Fnv.hashCode64(string));
            } else {
                if (this.jsonReader.isString()) {
                    throw new JSONException("TODO : " + this.jsonReader.current());
                }
                arrayList = new ArrayList();
                arrayList.add(string);
                do {
                    arrayList.add(this.jsonReader.readString());
                } while (this.jsonReader.isString());
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                multiNameSegment = new JSONPathSegment.MultiNameSegment(strArr);
            }
        } else if (c != '*') {
            if (c == '-') {
                int32Value = jSONReader3.readInt32Value();
                jSONReader = this.jsonReader;
                if (jSONReader.ch == ':') {
                    jSONReader.next();
                    jSONReader2 = this.jsonReader;
                    if (jSONReader2.ch == ']') {
                        multiNameSegment = new JSONPathSegment.RangeIndexSegment(int32Value, int32Value >= 0 ? 2147483647 : 0);
                    } else {
                        multiNameSegment = new JSONPathSegment.RangeIndexSegment(int32Value, jSONReader2.readInt32Value());
                    }
                } else {
                    if (jSONReader.isNumber()) {
                        zNextIfMatchIdent = false;
                    } else {
                        zNextIfMatchIdent = this.jsonReader.nextIfMatchIdent('l', 'a', 's', 't');
                        if (zNextIfMatchIdent) {
                            multiNameSegment = JSONPathSegmentIndex.of(int32Value);
                        }
                    }
                    arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(int32Value));
                    if (zNextIfMatchIdent) {
                        arrayList2.add(-1);
                        this.jsonReader.nextIfComma();
                    }
                    while (true) {
                        if (this.jsonReader.isNumber()) {
                            arrayList2.add(Integer.valueOf(this.jsonReader.readInt32Value()));
                        } else if (!this.jsonReader.nextIfMatchIdent('l', 'a', 's', 't')) {
                            arrayList2.add(-1);
                            this.jsonReader.nextIfComma();
                        } else {
                            iArr = new int[arrayList2.size()];
                            for (int i = 0; i < arrayList2.size(); i++) {
                                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                            }
                            multiNameSegment = new JSONPathSegment.MultiIndexSegment(iArr);
                        }
                    }
                }
            } else if (c == '?') {
                jSONReader3.next();
                multiNameSegment = parseFilter();
            } else if (c == 'l') {
                String fieldNameUnquote = jSONReader3.readFieldNameUnquote();
                if (!"last".equals(fieldNameUnquote)) {
                    throw new JSONException(AbstractC2784.m4757("not support : ", fieldNameUnquote));
                }
                multiNameSegment = JSONPathSegmentIndex.of(-1);
            } else if (c == 'r') {
                String fieldNameUnquote2 = jSONReader3.readFieldNameUnquote();
                if (!"randomIndex".equals(fieldNameUnquote2) || !this.jsonReader.nextIfMatch('(') || !this.jsonReader.nextIfMatch(')') || this.jsonReader.ch != ']') {
                    throw new JSONException(AbstractC2784.m4757("not support : ", fieldNameUnquote2));
                }
                multiNameSegment = JSONPathSegment.RandomIndexSegment.INSTANCE;
            } else if (c == '\'') {
                string = jSONReader3.readString();
                if (this.jsonReader.current() == ']') {
                    multiNameSegment = new JSONPathSegmentName(string, Fnv.hashCode64(string));
                } else {
                    if (this.jsonReader.isString()) {
                        throw new JSONException("TODO : " + this.jsonReader.current());
                    }
                    arrayList = new ArrayList();
                    arrayList.add(string);
                    do {
                        arrayList.add(this.jsonReader.readString());
                    } while (this.jsonReader.isString());
                    String[] strArr2 = new String[arrayList.size()];
                    arrayList.toArray(strArr2);
                    multiNameSegment = new JSONPathSegment.MultiNameSegment(strArr2);
                }
            } else if (c != '(') {
                switch (c) {
                    case '0':
                    case '1':
                    case 50 /* 50 */:
                    case 51 /* 51 */:
                    case '4':
                    case 53 /* 53 */:
                    case 54 /* 54 */:
                    case 55 /* 55 */:
                    case 56 /* 56 */:
                    case 57 /* 57 */:
                        int32Value = jSONReader3.readInt32Value();
                        jSONReader = this.jsonReader;
                        if (jSONReader.ch == ':') {
                            jSONReader.next();
                            jSONReader2 = this.jsonReader;
                            if (jSONReader2.ch == ']') {
                                multiNameSegment = new JSONPathSegment.RangeIndexSegment(int32Value, int32Value >= 0 ? 2147483647 : 0);
                            } else {
                                multiNameSegment = new JSONPathSegment.RangeIndexSegment(int32Value, jSONReader2.readInt32Value());
                            }
                        } else {
                            if (jSONReader.isNumber()) {
                                zNextIfMatchIdent = this.jsonReader.nextIfMatchIdent('l', 'a', 's', 't');
                                if (zNextIfMatchIdent) {
                                    multiNameSegment = JSONPathSegmentIndex.of(int32Value);
                                    break;
                                }
                            } else {
                                zNextIfMatchIdent = false;
                            }
                            arrayList2 = new ArrayList();
                            arrayList2.add(Integer.valueOf(int32Value));
                            if (false) {
                                arrayList2.add(-1);
                                this.jsonReader.nextIfComma();
                            }
                            while (true) {
                                if (this.jsonReader.isNumber()) {
                                    arrayList2.add(Integer.valueOf(this.jsonReader.readInt32Value()));
                                } else if (!this.jsonReader.nextIfMatchIdent('l', 'a', 's', 't')) {
                                    iArr = new int[arrayList2.size()];
                                    while (i < arrayList2.size()) {
                                        iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                                    }
                                    multiNameSegment = new JSONPathSegment.MultiIndexSegment(iArr);
                                } else {
                                    arrayList2.add(-1);
                                    this.jsonReader.nextIfComma();
                                }
                            }
                        }
                        break;
                    case 58 /* 58 */:
                        jSONReader3.next();
                        JSONReader jSONReader4 = this.jsonReader;
                        int int32Value2 = jSONReader4.ch == ']' ? 0 : jSONReader4.readInt32Value();
                        multiNameSegment = int32Value2 > 0 ? new JSONPathSegment.RangeIndexSegment(0, int32Value2) : new JSONPathSegment.RangeIndexSegment(-2147483648, int32Value2);
                        break;
                    default:
                        throw new JSONException("TODO : " + this.jsonReader.current());
                }
            } else {
                jSONReader3.next();
                if (!this.jsonReader.nextIfMatch('@') || !this.jsonReader.nextIfMatch('.')) {
                    throw new JSONException("not support : " + this.path);
                }
                String fieldNameUnquote3 = this.jsonReader.readFieldNameUnquote();
                
                if (!fieldNameUnquote3.equals("length") && !fieldNameUnquote3.equals("size")) {
                    throw new JSONException("not support : " + this.path);
                }
                int int32Value3 = this.jsonReader.readInt32Value();
                if (!this.jsonReader.nextIfMatch(')')) {
                    throw new JSONException("not support : ".concat(fieldNameUnquote3));
                }
                if (int32Value3 > 0) {
                    throw new JSONException("not support : ".concat(fieldNameUnquote3));
                }
                multiNameSegment = JSONPathSegmentIndex.of(int32Value3);
            }
        } else {
            jSONReader3.next();
            multiNameSegment = JSONPathSegment.AllSegment.INSTANCE_ARRAY;
        }
        while (true) {
            char c2 = this.jsonReader.ch;
            if (c2 != '&' && c2 != '|' && c2 != 'a' && c2 != 'o') {
                while (this.filterNests > 0) {
                    this.jsonReader.next();
                    this.filterNests--;
                }
                if (this.jsonReader.nextIfArrayEnd()) {
                    return multiNameSegment;
                }
                throw new JSONException(this.jsonReader.info("jsonpath syntax error"));
            }
            this.filterNests--;
            multiNameSegment = parseFilterRest(multiNameSegment);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private JSONPathSegment parseProperty() {
        JSONPathSegment jSONPathFunction;
        JSONPathFunction jSONPathFunction2;
        Number numberValueOf;
        BigDecimal bigDecimalStripTrailingZeros;
        BigInteger bigIntegerUnscaledValue;
        int length;
        JSONReader jSONReader = this.jsonReader;
        char c = jSONReader.ch;
        if (c == '*') {
            jSONReader.next();
            return JSONPathSegment.AllSegment.INSTANCE;
        }
        if (c == '.') {
            jSONReader.next();
            JSONReader jSONReader2 = this.jsonReader;
            if (jSONReader2.ch != '*') {
                return new JSONPathSegment.CycleNameSegment(this.jsonReader.getFieldName(), jSONReader2.readFieldNameHashCodeUnquote());
            }
            jSONReader2.next();
            return new JSONPathSegment.CycleNameSegment("*", Fnv.hashCode64("*"));
        }
        boolean zIsNumber = jSONReader.isNumber();
        long fieldNameHashCodeUnquote = this.jsonReader.readFieldNameHashCodeUnquote();
        String fieldName = this.jsonReader.getFieldName();
        byte b = 9;
        if (zIsNumber && (length = fieldName.length()) <= 9) {
            for (int i = 0; i < length; i++) {
                char cCharAt = fieldName.charAt(i);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
            }
        }
        JSONReader jSONReader3 = this.jsonReader;
        if (jSONReader3.ch != '(') {
            return new JSONPathSegmentName(fieldName, fieldNameHashCodeUnquote);
        }
        jSONReader3.next();
        
        switch (fieldName.hashCode()) {
            case -2093674864:
                b = fieldName.equals("entrySet") ? (byte) 0 : (byte) -1;
                break;
            case -1325958191:
                b = fieldName.equals("double") ? (byte) 1 : (byte) -1;
                break;
            case -1106363674:
                b = fieldName.equals("length") ? (byte) 2 : (byte) -1;
                break;
            case -823812830:
                b = fieldName.equals("values") ? (byte) 3 : (byte) -1;
                break;
            case 96370:
                b = fieldName.equals("abs") ? (byte) 4 : (byte) -1;
                break;
            case 107876:
                b = fieldName.equals("max") ? (byte) 5 : (byte) -1;
                break;
            case 108114:
                b = fieldName.equals("min") ? (byte) 6 : (byte) -1;
                break;
            case 114251:
                b = fieldName.equals("sum") ? (byte) 7 : (byte) -1;
                break;
            case 3049733:
                b = fieldName.equals("ceil") ? (byte) 8 : (byte) -1;
                break;
            case 3288564:
                if (!fieldName.equals("keys")) {
                    b = -1;
                }
                break;
            case 3314326:
                b = fieldName.equals("last") ? (byte) 10 : (byte) -1;
                break;
            case 3530753:
                b = fieldName.equals("size") ? (byte) 11 : (byte) -1;
                break;
            case 3568674:
                b = fieldName.equals("trim") ? (byte) 12 : (byte) -1;
                break;
            case 3575610:
                b = fieldName.equals("type") ? 13 : (byte) -1;
                break;
            case 97440432:
                b = fieldName.equals("first") ? 14 : (byte) -1;
                break;
            case 97526796:
                b = fieldName.equals("floor") ? 15 : (byte) -1;
                break;
            case 100346066:
                b = fieldName.equals("index") ? (byte) 16 : (byte) -1;
                break;
            case 103164673:
                b = fieldName.equals("lower") ? (byte) 17 : (byte) -1;
                break;
            case 111499426:
                b = fieldName.equals("upper") ? (byte) 18 : (byte) -1;
                break;
            case 660387005:
                b = fieldName.equals("ceiling") ? (byte) 19 : (byte) -1;
                break;
            case 921111605:
                b = fieldName.equals("negative") ? (byte) 20 : (byte) -1;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                jSONPathFunction = JSONPathSegment.EntrySetSegment.INSTANCE;
                break;
            case 1:
                jSONPathFunction = JSONPathFunction.FUNC_DOUBLE;
                break;
            case 2:
            case 11:
                jSONPathFunction = JSONPathSegment.LengthSegment.INSTANCE;
                break;
            case 3:
                jSONPathFunction = JSONPathSegment.ValuesSegment.INSTANCE;
                break;
            case 4:
                jSONPathFunction = JSONPathFunction.FUNC_ABS;
                break;
            case 5:
                jSONPathFunction = JSONPathSegment.MaxSegment.INSTANCE;
                break;
            case 6:
                jSONPathFunction = JSONPathSegment.MinSegment.INSTANCE;
                break;
            case 7:
                jSONPathFunction = JSONPathSegment.SumSegment.INSTANCE;
                break;
            case 8:
            case 19:
                jSONPathFunction = JSONPathFunction.FUNC_CEIL;
                break;
            case 9:
                jSONPathFunction = JSONPathSegment.KeysSegment.INSTANCE;
                break;
            case 10:
                jSONPathFunction = JSONPathFunction.FUNC_LAST;
                break;
            case 12 /* 12 */:
                jSONPathFunction = JSONPathFunction.FUNC_TRIM;
                break;
            case 13:
                jSONPathFunction = JSONPathFunction.FUNC_TYPE;
                break;
            case 14 /* 14 */:
                jSONPathFunction = JSONPathFunction.FUNC_FIRST;
                break;
            case 15:
                jSONPathFunction = JSONPathFunction.FUNC_FLOOR;
                break;
            case 16:
                if (!this.jsonReader.isNumber()) {
                    if (this.jsonReader.isString()) {
                        jSONPathFunction2 = new JSONPathFunction(new JSONPathFunction.IndexString(this.jsonReader.readString()));
                        jSONPathFunction = jSONPathFunction2;
                        break;
                    }
                    throw new JSONException("not support syntax, path : " + this.path);
                }
                Number number = this.jsonReader.readNumber();
                if (number instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) number;
                    if (bigDecimal.signum() == 0) {
                        numberValueOf = number;
                        bigDecimalStripTrailingZeros = new BigDecimal(BigInteger.ZERO, 0);
                    } else {
                        numberValueOf = number;
                        bigDecimalStripTrailingZeros = bigDecimal.stripTrailingZeros();
                    }
                    if (bigDecimalStripTrailingZeros.scale() != 0) {
                        jSONPathFunction2 = new JSONPathFunction(new JSONPathFunction.IndexDecimal(bigDecimalStripTrailingZeros));
                        jSONPathFunction = jSONPathFunction2;
                    } else {
                        bigIntegerUnscaledValue = bigDecimalStripTrailingZeros.unscaledValue();
                        if (bigIntegerUnscaledValue.compareTo(TypeUtils.BIGINT_INT64_MIN) >= 0 && bigIntegerUnscaledValue.compareTo(TypeUtils.BIGINT_INT64_MAX) <= 0) {
                            numberValueOf = bigIntegerUnscaledValue;
                            numberValueOf = bigIntegerUnscaledValue;
                            numberValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
                        }
                    }
                    break;
                }
                numberValueOf = bigIntegerUnscaledValue;
                numberValueOf = bigIntegerUnscaledValue;
                numberValueOf = bigIntegerUnscaledValue;
                numberValueOf = number;
                if ((numberValueOf instanceof Integer) || (numberValueOf instanceof Long)) {
                    jSONPathFunction = new JSONPathFunction(new JSONPathFunction.IndexInt(numberValueOf.longValue()));
                    break;
                }
                throw new JSONException("not support syntax, path : " + this.path);
            case 17 /* 17 */:
                jSONPathFunction = JSONPathFunction.FUNC_LOWER;
                break;
            case 18 /* 18 */:
                jSONPathFunction = JSONPathFunction.FUNC_UPPER;
                break;
            case 20:
                jSONPathFunction = JSONPathFunction.FUNC_NEGATIVE;
                break;
            default:
                throw new JSONException("not support syntax, path : " + this.path);
        }
        if (this.jsonReader.nextIfMatch(')')) {
            return jSONPathFunction;
        }
        throw new JSONException("not support syntax, path : " + this.path);
    }

    public JSONPath parse(JSONPath.Feature... featureArr) {
        char c;
        char c2;
        char c3;
        JSONPathSegment filter;
        int i;
        if (this.dollar && this.jsonReader.ch == 26) {
            return this.negative ? new JSONPathSingle(JSONPathFunction.FUNC_NEGATIVE, this.path, new JSONPath.Feature[0]) : JSONPath.RootPath.INSTANCE;
        }
        JSONReader jSONReader = this.jsonReader;
        if (jSONReader.ch == 'e') {
            c = 'a';
            c2 = '.';
            c3 = '@';
            if (jSONReader.nextIfMatchIdent('e', 'x', 'i', 's', 't', 's')) {
                if (!this.jsonReader.nextIfMatch('(')) {
                    throw new JSONException("syntax error " + this.path);
                }
                JSONReader jSONReader2 = this.jsonReader;
                if (jSONReader2.ch == '@') {
                    jSONReader2.next();
                    if (!this.jsonReader.nextIfMatch('.')) {
                        throw new JSONException("syntax error " + this.path);
                    }
                }
                char c4 = this.jsonReader.ch;
                if ((c4 < 'a' || c4 > 'z') && !((c4 >= 'A' && c4 <= 'Z') || c4 == '_' || c4 == '@' || Character.isIdeographic(c4))) {
                    throw new JSONException("syntax error " + this.path);
                }
                JSONPathSegment property = parseProperty();
                if (this.jsonReader.nextIfMatch(')')) {
                    return new JSONPathTwoSegment(this.path, property, JSONPathFunction.FUNC_EXISTS, new JSONPath.Feature[0]);
                }
                throw new JSONException("syntax error " + this.path);
            }
        } else {
            c = 'a';
            c2 = '.';
            c3 = '@';
        }
        while (true) {
            JSONReader jSONReader3 = this.jsonReader;
            char c5 = jSONReader3.ch;
            if (c5 == 26) {
                if (this.negative) {
                    int i2 = this.segmentIndex;
                    if (i2 == 1) {
                        this.second = JSONPathFunction.FUNC_NEGATIVE;
                    } else if (i2 == 2) {
                        ArrayList arrayList = new ArrayList();
                        this.segments = arrayList;
                        arrayList.add(this.first);
                        this.segments.add(this.second);
                        this.segments.add(JSONPathFunction.FUNC_NEGATIVE);
                    } else {
                        this.segments.add(JSONPathFunction.FUNC_NEGATIVE);
                    }
                    this.segmentIndex++;
                }
                int i3 = this.segmentIndex;
                if (i3 != 1) {
                    return i3 == 2 ? new JSONPathTwoSegment(this.path, this.first, this.second, featureArr) : new JSONPathMulti(this.path, this.segments, featureArr);
                }
                JSONPathSegment jSONPathSegment = this.first;
                if (jSONPathSegment instanceof JSONPathSegmentName) {
                    return new JSONPathSingleName(this.path, (JSONPathSegmentName) this.first, featureArr);
                }
                if (jSONPathSegment instanceof JSONPathSegmentIndex) {
                    JSONPathSegmentIndex jSONPathSegmentIndex = (JSONPathSegmentIndex) jSONPathSegment;
                    if (jSONPathSegmentIndex.index >= 0) {
                        return new JSONPathSingleIndex(this.path, jSONPathSegmentIndex, featureArr);
                    }
                }
                return new JSONPathSingle(this.first, this.path, featureArr);
            }
            if (c5 == 46) {
                jSONReader3.next();
                filter = parseProperty();
            } else if (c5 == '[') {
                filter = parseArrayAccess();
            } else if ((c5 >= 97 && c5 <= 'z') || ((c5 >= 'A' && c5 <= 'Z') || c5 == '_' || Character.isIdeographic(c5))) {
                filter = parseProperty();
            } else if (c5 == '?') {
                if (this.dollar && (i = this.segmentIndex) == 0) {
                    this.first = JSONPathSegment.RootSegment.INSTANCE;
                    this.segmentIndex = 1;
                }
                this.jsonReader.next();
                filter = parseFilter();
            } else {
                if (c5 != 64) {
                    throw new JSONException("not support " + c5);
                }
                this.jsonReader.next();
                filter = JSONPathSegment.SelfSegment.INSTANCE;
            }
            int i4 = this.segmentIndex;
            if (i4 == 0) {
                this.first = filter;
            } else if (i4 == 1) {
                this.second = filter;
            } else if (i4 == 2) {
                ArrayList arrayList2 = new ArrayList();
                this.segments = arrayList2;
                arrayList2.add(this.first);
                this.segments.add(this.second);
                this.segments.add(filter);
            } else {
                this.segments.add(filter);
            }
            this.segmentIndex++;
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r1v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v34 ??, new type: java.util.ArrayList
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r1v52 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r1v52 ??, new type: java.util.ArrayList
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v22 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v22 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v10 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v10 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v11 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v11 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r4v12 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v12 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v18 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v18 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v19 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v19 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v20 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v20 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v26 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v27 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v27 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v29 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v32 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v33 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v5 ??, new type: int
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v51 ??, new type: byte
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public com.alibaba.fastjson2.JSONPathSegment parseFilter() {
        /*
            Method dump skipped, instruction units count: 2534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.JSONPathParser.parseFilter():com.alibaba.fastjson2.JSONPathSegment");
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0077  */
    public JSONPathSegment parseFilterRest(JSONPathSegment jSONPathSegment) {
        String fieldNameUnquote;
        String fieldNameUnquote2;
        JSONReader jSONReader = this.jsonReader;
        char c = jSONReader.ch;
        boolean z = true;
        if (c == '&') {
            jSONReader.next();
            if (!this.jsonReader.nextIfMatch('&')) {
                throw new JSONException(this.jsonReader.info("jsonpath syntax error"));
            }
        } else if (c == 'A') {
            fieldNameUnquote = jSONReader.readFieldNameUnquote();
            if (!"and".equalsIgnoreCase(fieldNameUnquote)) {
                throw new JSONException(AbstractC2784.m4757("syntax error : ", fieldNameUnquote));
            }
        } else {
            if (c == 'O') {
                fieldNameUnquote2 = jSONReader.readFieldNameUnquote();
                if (!"or".equalsIgnoreCase(fieldNameUnquote2)) {
                    throw new JSONException(AbstractC2784.m4757("syntax error : ", fieldNameUnquote2));
                }
            } else if (c == 'a') {
                fieldNameUnquote = jSONReader.readFieldNameUnquote();
                if (!"and".equalsIgnoreCase(fieldNameUnquote)) {
                    throw new JSONException(AbstractC2784.m4757("syntax error : ", fieldNameUnquote));
                }
            } else if (c == 'o') {
                fieldNameUnquote2 = jSONReader.readFieldNameUnquote();
                if (!"or".equalsIgnoreCase(fieldNameUnquote2)) {
                    throw new JSONException(AbstractC2784.m4757("syntax error : ", fieldNameUnquote2));
                }
            } else {
                if (c != '|') {
                    throw new JSONException("TODO : " + this.jsonReader.ch);
                }
                jSONReader.next();
                if (!this.jsonReader.nextIfMatch('|')) {
                    throw new JSONException(this.jsonReader.info("jsonpath syntax error"));
                }
            }
            z = false;
        }
        JSONPathSegment filter = parseFilter();
        if (jSONPathSegment instanceof JSONPathFilter.GroupFilter) {
            JSONPathFilter.GroupFilter groupFilter = (JSONPathFilter.GroupFilter) jSONPathSegment;
            groupFilter.filters.add(((JSONPathFilter) filter).setAnd(z));
            return groupFilter;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add((JSONPathFilter) jSONPathSegment);
        if (filter instanceof JSONPathFilter.GroupFilter) {
            List<JSONPathFilter> list = ((JSONPathFilter.GroupFilter) filter).filters;
            if (list != null && list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    JSONPathFilter jSONPathFilter = list.get(i);
                    if (i == 0) {
                        jSONPathFilter.setAnd(z);
                    }
                    arrayList.add(jSONPathFilter);
                }
            }
        } else {
            arrayList.add(((JSONPathFilter) filter).setAnd(z));
        }
        return new JSONPathFilter.GroupFilter(arrayList);
    }

    public JSONPathSegment parseSegment() {
        Object string;
        if (this.jsonReader.nextIfMatch('@')) {
            if (this.jsonReader.nextIfMatch('.')) {
                string = this.jsonReader.isNumber() ? this.jsonReader.readNumber() : this.jsonReader.readFieldNameUnquote();
            } else if (this.jsonReader.nextIfArrayStart()) {
                if (this.jsonReader.isNumber()) {
                    string = this.jsonReader.readNumber();
                } else {
                    if (!this.jsonReader.isString()) {
                        throw new JSONException(this.jsonReader.info("jsonpath syntax error"));
                    }
                    string = this.jsonReader.readString();
                }
                if (!this.jsonReader.nextIfArrayEnd()) {
                    throw new JSONException(this.jsonReader.info("jsonpath syntax error"));
                }
            } else {
                string = null;
            }
            if (string instanceof String) {
                String str = (String) string;
                return new JSONPathSegmentName(str, Fnv.hashCode64(str));
            }
            if (string instanceof Integer) {
                return new JSONPathSegmentIndex(((Integer) string).intValue());
            }
        }
        throw new JSONException(this.jsonReader.info("jsonpath syntax error"));
    }
}
