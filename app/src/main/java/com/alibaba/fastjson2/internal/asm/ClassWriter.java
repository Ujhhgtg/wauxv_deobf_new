package com.alibaba.fastjson2.internal.asm;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.util.TypeUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import okhttp3.internal.http2.Settings;
import p000.AbstractC1225feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ClassWriter {
    private int accessFlags;
    private FieldWriter firstField;
    private MethodWriter firstMethod;
    private int interfaceCount;
    private int[] interfaces;
    private FieldWriter lastField;
    private MethodWriter lastMethod;
    private int superClass;
    private final SymbolTable symbolTable = new SymbolTable(this);
    private int thisClass;
    private final Function<String, Class> typeProvider;
    private int version;

    public ClassWriter(Function<String, Class> function) {
        this.typeProvider = function;
    }

    public String getCommonSuperClass(String str, String str2) {
        Class<? super Object> clsLoadClass = loadClass(str);
        if (clsLoadClass == null) {
            throw new JSONException(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("class not found ", str));
        }
        Class<?> clsLoadClass2 = loadClass(str2);
        if (clsLoadClass2 == null) {
            return ASMUtils.TYPE_OBJECT;
        }
        if (clsLoadClass.isAssignableFrom(clsLoadClass2)) {
            return str;
        }
        if (clsLoadClass2.isAssignableFrom(clsLoadClass)) {
            return str2;
        }
        if (clsLoadClass.isInterface() || clsLoadClass2.isInterface()) {
            return ASMUtils.TYPE_OBJECT;
        }
        do {
            clsLoadClass = clsLoadClass.getSuperclass();
        } while (!clsLoadClass.isAssignableFrom(clsLoadClass2));
        return clsLoadClass.getName().replace('.', '/');
    }

    public Class loadClass(String str) {
        str.getClass();
        switch (str) {
            case "java/util/List":
                return List.class;
            case "java/util/ArrayList":
                return ArrayList.class;
            case "java/lang/Object":
                return Object.class;
            default:
                String strReplace = str.replace('/', '.');
                Function<String, Class> function = this.typeProvider;
                Class clsApply = function != null ? function.apply(strReplace) : null;
                return clsApply == null ? TypeUtils.loadClass(strReplace) : clsApply;
        }
    }

    public byte[] toByteArray() {
        int iComputeMethodInfoSize = (this.interfaceCount * 2) + 24;
        int i = 0;
        for (FieldWriter fieldWriter = this.firstField; fieldWriter != null; fieldWriter = fieldWriter.fv) {
            i++;
            iComputeMethodInfoSize += 8;
        }
        int i2 = 0;
        for (MethodWriter methodWriter = this.firstMethod; methodWriter != null; methodWriter = methodWriter.mv) {
            i2++;
            iComputeMethodInfoSize += methodWriter.computeMethodInfoSize();
        }
        SymbolTable symbolTable = this.symbolTable;
        int i3 = iComputeMethodInfoSize + symbolTable.constantPool.length;
        int i4 = symbolTable.constantPoolCount;
        if (i4 > 65535) {
            throw new JSONException("Class too large: " + this.symbolTable.className + ", constantPoolCount " + i4);
        }
        ByteVector byteVector = new ByteVector(i3);
        byteVector.putInt(-889275714).putInt(this.version);
        ByteVector byteVectorPutShort = byteVector.putShort(i4);
        ByteVector byteVector2 = this.symbolTable.constantPool;
        byteVectorPutShort.putByteArray(byteVector2.data, 0, byteVector2.length);
        byteVector.putShort(this.accessFlags).putShort(this.thisClass).putShort(this.superClass);
        byteVector.putShort(this.interfaceCount);
        for (int i5 = 0; i5 < this.interfaceCount; i5++) {
            byteVector.putShort(this.interfaces[i5]);
        }
        byteVector.putShort(i);
        for (FieldWriter fieldWriter2 = this.firstField; fieldWriter2 != null; fieldWriter2 = fieldWriter2.fv) {
            fieldWriter2.putFieldInfo(byteVector);
        }
        byteVector.putShort(i2);
        boolean z = false;
        for (MethodWriter methodWriter2 = this.firstMethod; methodWriter2 != null; methodWriter2 = methodWriter2.mv) {
            z |= methodWriter2.hasAsmInstructions;
            methodWriter2.putMethodInfo(byteVector);
        }
        byteVector.putShort(0);
        if (z) {
            throw new UnsupportedOperationException();
        }
        return byteVector.data;
    }

    public final void visit(int i, int i2, String str, String str2, String[] strArr) {
        this.version = i;
        this.accessFlags = i2;
        this.thisClass = this.symbolTable.setMajorVersionAndClassName(i & Settings.DEFAULT_INITIAL_WINDOW_SIZE, str);
        this.superClass = str2 == null ? 0 : this.symbolTable.addConstantUtf8Reference(7, str2).index;
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        int length = strArr.length;
        this.interfaceCount = length;
        this.interfaces = new int[length];
        for (int i3 = 0; i3 < this.interfaceCount; i3++) {
            this.interfaces[i3] = this.symbolTable.addConstantUtf8Reference(7, strArr[i3]).index;
        }
    }

    public final FieldWriter visitField(int i, String str, String str2) {
        FieldWriter fieldWriter = new FieldWriter(this.symbolTable, i, str, str2);
        if (this.firstField == null) {
            this.firstField = fieldWriter;
        } else {
            this.lastField.fv = fieldWriter;
        }
        this.lastField = fieldWriter;
        return fieldWriter;
    }

    public final MethodWriter visitMethod(int i, String str, String str2, int i2) {
        MethodWriter methodWriter = new MethodWriter(this.symbolTable, i, str, str2, i2);
        if (this.firstMethod == null) {
            this.firstMethod = methodWriter;
        } else {
            this.lastMethod.mv = methodWriter;
        }
        this.lastMethod = methodWriter;
        return methodWriter;
    }
}
