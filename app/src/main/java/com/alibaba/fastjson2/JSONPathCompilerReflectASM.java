package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPathCompilerReflect;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.ClassWriter;
import com.alibaba.fastjson2.internal.asm.MethodWriter;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.util.DynamicClassLoader;
import com.alibaba.fastjson2.writer.FieldWriter;
import com.alibaba.fastjson2.writer.ObjectWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicLong;
import p000.AbstractC2784;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathCompilerReflectASM extends JSONPathCompilerReflect {
    private static final String METHOD_SINGLE_NAME_PATH_TYPED_INIT;
    private final DynamicClassLoader classLoader;
    private static final AtomicLong seed = new AtomicLong();
    static final JSONPathCompilerReflectASM INSTANCE = new JSONPathCompilerReflectASM(DynamicClassLoader.getInstance());
    private static final String TYPE_SINGLE_NAME_PATH_TYPED = ASMUtils.type(JSONPathCompilerReflect.SingleNamePathTyped.class);

    static {
        StringBuilder sb = new StringBuilder("(Ljava/lang/String;Ljava/lang/Class;");
        sb.append(ASMUtils.DESC_OBJECT_READER);
        sb.append(ASMUtils.DESC_FIELD_READER);
        sb.append(ASMUtils.DESC_OBJECT_WRITER);
        METHOD_SINGLE_NAME_PATH_TYPED_INIT = AbstractC2784.m4752(sb, ASMUtils.DESC_FIELD_WRITER, ")V");
    }

    public JSONPathCompilerReflectASM(DynamicClassLoader dynamicClassLoader) {
        this.classLoader = dynamicClassLoader;
    }

    private void gwGetValue(MethodWriter methodWriter, String str, FieldWriter fieldWriter) {
        Method method = fieldWriter.method;
        Field field = fieldWriter.field;
        String strDesc = ASMUtils.desc(fieldWriter.fieldClass);
        if (method == null) {
            methodWriter.getfield(str, field.getName(), strDesc);
        } else {
            methodWriter.invokevirtual(str, method.getName(), AbstractC2784.m4757("()", strDesc));
        }
    }

    private void gwSetValue(MethodWriter methodWriter, String str, FieldReader fieldReader) {
        Method method = fieldReader.method;
        Field field = fieldReader.field;
        String strDesc = ASMUtils.desc(fieldReader.fieldClass);
        if (method == null) {
            methodWriter.putfield(str, field.getName(), strDesc);
            return;
        }
        Class<?> returnType = method.getReturnType();
        methodWriter.invokevirtual(str, method.getName(), "(" + strDesc + ')' + ASMUtils.desc(returnType));
        if (returnType != Void.TYPE) {
            methodWriter.pop();
        }
    }

    private boolean support(Class cls) {
        boolean zIsExternalClass = this.classLoader.isExternalClass(cls);
        int modifiers = cls.getModifiers();
        return Modifier.isAbstract(modifiers) || Modifier.isInterface(modifiers) || !Modifier.isPublic(modifiers) || zIsExternalClass;
    }

    @Override // com.alibaba.fastjson2.JSONPathCompilerReflect
    public JSONPath compileSingleNamePath(Class cls, JSONPathSingleName jSONPathSingleName) {
        String str;
        String str2;
        String str3;
        FieldWriter fieldWriter;
        JSONPathSingleName jSONPathSingleName2;
        char c;
        int i;
        int i2;
        if (support(cls)) {
            return super.compileSingleNamePath(cls, jSONPathSingleName);
        }
        String str4 = jSONPathSingleName.name;
        String strType = ASMUtils.type(cls);
        ObjectReader objectReader = jSONPathSingleName.getReaderContext().getObjectReader(cls);
        FieldReader fieldReader = objectReader.getFieldReader(str4);
        ObjectWriter objectWriter = jSONPathSingleName.getWriterContext().getObjectWriter(cls);
        FieldWriter fieldWriter2 = objectWriter.getFieldWriter(str4);
        ClassWriter classWriter = new ClassWriter(null);
        String str5 = "JSONPath_" + seed.incrementAndGet();
        Package r10 = JSONPathCompilerReflectASM.class.getPackage();
        if (r10 != null) {
            String name = r10.getName();
            int length = name.length();
            int i3 = length + 1;
            char[] cArr = new char[str5.length() + i3];
            name.getChars(0, name.length(), cArr, 0);
            cArr[length] = '.';
            str5.getChars(0, str5.length(), cArr, i3);
            str5 = new String(cArr);
            char c2 = '/';
            cArr[length] = '/';
            int i4 = 0;
            while (i4 < length) {
                char c3 = c2;
                if (cArr[i4] == '.') {
                    cArr[i4] = c3;
                }
                i4++;
                c2 = c3;
            }
            str = new String(cArr);
        } else {
            str = str5;
        }
        String str6 = TYPE_SINGLE_NAME_PATH_TYPED;
        classWriter.visit(52, 49, str, str6, new String[0]);
        String str7 = METHOD_SINGLE_NAME_PATH_TYPED_INIT;
        MethodWriter methodWriterVisitMethod = classWriter.visitMethod(1, "<init>", str7, 64);
        methodWriterVisitMethod.aload(0);
        methodWriterVisitMethod.aload(1);
        methodWriterVisitMethod.aload(2);
        methodWriterVisitMethod.aload(3);
        methodWriterVisitMethod.aload(4);
        methodWriterVisitMethod.aload(5);
        methodWriterVisitMethod.aload(6);
        methodWriterVisitMethod.invokespecial(str6, "<init>", str7);
        methodWriterVisitMethod.return_();
        methodWriterVisitMethod.visitMaxs(3, 3);
        Class cls2 = Character.TYPE;
        Class cls3 = Boolean.TYPE;
        Class cls4 = Byte.TYPE;
        Class cls5 = Short.TYPE;
        Class cls6 = Double.TYPE;
        Class cls7 = Float.TYPE;
        Class cls8 = Long.TYPE;
        Class cls9 = Integer.TYPE;
        String str8 = str5;
        if (fieldReader != null) {
            Class cls10 = fieldReader.fieldClass;
            if (cls10 == cls9) {
                MethodWriter methodWriterVisitMethod2 = classWriter.visitMethod(1, "setInt", "(Ljava/lang/Object;I)V", 64);
                methodWriterVisitMethod2.aload(1);
                methodWriterVisitMethod2.checkcast(strType);
                c = 2;
                methodWriterVisitMethod2.visitVarInsn(21, 2);
                gwSetValue(methodWriterVisitMethod2, strType, fieldReader);
                methodWriterVisitMethod2.return_();
                methodWriterVisitMethod2.visitMaxs(2, 2);
            } else {
                c = 2;
            }
            if (cls10 == cls8) {
                i = 1;
                i2 = 64;
                MethodWriter methodWriterVisitMethod3 = classWriter.visitMethod(1, "setLong", "(Ljava/lang/Object;J)V", 64);
                methodWriterVisitMethod3.aload(1);
                methodWriterVisitMethod3.checkcast(strType);
                methodWriterVisitMethod3.lload(2);
                gwSetValue(methodWriterVisitMethod3, strType, fieldReader);
                methodWriterVisitMethod3.return_();
                methodWriterVisitMethod3.visitMaxs(2, 2);
            } else {
                i = 1;
                i2 = 64;
            }
            MethodWriter methodWriterVisitMethod4 = classWriter.visitMethod(i, "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", i2);
            methodWriterVisitMethod4.aload(i);
            methodWriterVisitMethod4.checkcast(strType);
            methodWriterVisitMethod4.aload(2);
            if (cls10 == cls9) {
                methodWriterVisitMethod4.checkcast("java/lang/Number");
                methodWriterVisitMethod4.invokevirtual("java/lang/Number", "intValue", "()I");
            } else if (cls10 == cls8) {
                methodWriterVisitMethod4.checkcast("java/lang/Number");
                methodWriterVisitMethod4.invokevirtual("java/lang/Number", "longValue", "()J");
            } else if (cls10 == cls7) {
                methodWriterVisitMethod4.checkcast("java/lang/Number");
                methodWriterVisitMethod4.invokevirtual("java/lang/Number", "floatValue", "()F");
            } else if (cls10 == cls6) {
                methodWriterVisitMethod4.checkcast("java/lang/Number");
                methodWriterVisitMethod4.invokevirtual("java/lang/Number", "doubleValue", "()D");
            } else if (cls10 == cls5) {
                methodWriterVisitMethod4.checkcast("java/lang/Number");
                methodWriterVisitMethod4.invokevirtual("java/lang/Number", "shortValue", "()S");
            } else {
                if (cls10 == cls4) {
                    methodWriterVisitMethod4.checkcast("java/lang/Number");
                    methodWriterVisitMethod4.invokevirtual("java/lang/Number", "byteValue", "()B");
                } else {
                    if (cls10 == cls3) {
                        str3 = r8;
                        methodWriterVisitMethod4.checkcast(str3);
                        methodWriterVisitMethod4.invokevirtual(str3, "booleanValue", "()Z");
                    } else {
                        str3 = r8;
                        if (cls10 == cls2) {
                            str2 = r6;
                            methodWriterVisitMethod4.checkcast(str2);
                            cls2 = cls2;
                            methodWriterVisitMethod4.invokevirtual(str2, "charValue", "()C");
                        } else {
                            cls2 = cls2;
                        }
                    }
                    str2 = r6;
                }
                gwSetValue(methodWriterVisitMethod4, strType, fieldReader);
                methodWriterVisitMethod4.return_();
                methodWriterVisitMethod4.visitMaxs(2, 2);
            }
            str2 = "java/lang/Character";
            str3 = "java/lang/Boolean";
            gwSetValue(methodWriterVisitMethod4, strType, fieldReader);
            methodWriterVisitMethod4.return_();
            methodWriterVisitMethod4.visitMaxs(2, 2);
        } else {
            cls2 = cls2;
            str2 = "java/lang/Character";
            fieldWriter2 = fieldWriter2;
            str3 = "java/lang/Boolean";
        }
        if (fieldWriter2 != null) {
            Class cls11 = fieldReader.fieldClass;
            String str9 = str2;
            MethodWriter methodWriterVisitMethod5 = classWriter.visitMethod(1, "eval", "(Ljava/lang/Object;)Ljava/lang/Object;", 64);
            methodWriterVisitMethod5.aload(1);
            methodWriterVisitMethod5.checkcast(strType);
            fieldWriter = fieldWriter2;
            gwGetValue(methodWriterVisitMethod5, strType, fieldWriter);
            if (cls11 == cls9) {
                methodWriterVisitMethod5.invokestatic("java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            } else if (cls11 == cls8) {
                methodWriterVisitMethod5.invokestatic("java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            } else if (cls11 == cls7) {
                methodWriterVisitMethod5.invokestatic("java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            } else if (cls11 == cls6) {
                methodWriterVisitMethod5.invokestatic("java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            } else if (cls11 == cls5) {
                methodWriterVisitMethod5.invokestatic("java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            } else if (cls11 == cls4) {
                methodWriterVisitMethod5.invokestatic("java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            } else if (cls11 == cls3) {
                methodWriterVisitMethod5.invokestatic(str3, "valueOf", "(Z)Ljava/lang/Boolean;");
            } else if (cls11 == cls2) {
                methodWriterVisitMethod5.invokestatic(str9, "valueOf", "(C)Ljava/lang/Character;");
            }
            methodWriterVisitMethod5.areturn();
            methodWriterVisitMethod5.visitMaxs(2, 2);
        } else {
            fieldWriter = fieldWriter2;
        }
        byte[] byteArray = classWriter.toByteArray();
        try {
            jSONPathSingleName2 = jSONPathSingleName;
            try {
                return (JSONPath) this.classLoader.defineClassPublic(str8, byteArray, 0, byteArray.length).getConstructors()[0].newInstance(jSONPathSingleName2.path, cls, objectReader, fieldReader, objectWriter, fieldWriter);
            } catch (Throwable th) {
                th = th;
                throw new JSONException("compile jsonpath error, path " + jSONPathSingleName2.path + ", objectType " + cls.getTypeName(), th);
            }
        } catch (Throwable th2) {
            th = th2;
            jSONPathSingleName2 = jSONPathSingleName;
        }
    }
}
