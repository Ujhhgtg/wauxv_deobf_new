package p000;

import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2587feyxiexzfUjhhgtg extends ObjectInputStream {
    @Override // java.io.ObjectInputStream
    public final Class resolveClass(ObjectStreamClass objectStreamClass) throws ClassNotFoundException, IOException {
        Class<?> clsResolveClass = super.resolveClass(objectStreamClass);
        if (AbstractC2590feyxiexzfUjhhgtg.m3847Ujhhgtgfeyxiexzf(clsResolveClass)) {
            return clsResolveClass;
        }
        throw new InvalidClassException("BeanShell snapshot rejected class: ".concat(clsResolveClass.getName()));
    }
}
