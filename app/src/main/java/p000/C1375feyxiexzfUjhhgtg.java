package p000;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛴᛲ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1375feyxiexzfUjhhgtg implements ParameterizedType, Type {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Class f4869Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Type f4870Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Type[] f4871Ujhhgtgfeyxiexzf;

    public C1375feyxiexzfUjhhgtg(Class cls, Type type, ArrayList arrayList) {
        this.f4869Ujhhgtgfeyxiexzf = cls;
        this.f4870Ujhhgtgfeyxiexzf = type;
        this.f4871Ujhhgtgfeyxiexzf = (Type[]) arrayList.toArray(new Type[0]);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ParameterizedType)) {
            return false;
        }
        ParameterizedType parameterizedType = (ParameterizedType) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4869Ujhhgtgfeyxiexzf, parameterizedType.getRawType()) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4870Ujhhgtgfeyxiexzf, parameterizedType.getOwnerType()) && Arrays.equals(this.f4871Ujhhgtgfeyxiexzf, parameterizedType.getActualTypeArguments());
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return this.f4871Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f4870Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f4869Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Class cls = this.f4869Ujhhgtgfeyxiexzf;
        Type type = this.f4870Ujhhgtgfeyxiexzf;
        if (type != null) {
            sb.append(AbstractC1937feyxiexzfUjhhgtg.m3271Ujhhgtgfeyxiexzf(type));
            sb.append("$");
            sb.append(cls.getSimpleName());
        } else {
            sb.append(AbstractC1937feyxiexzfUjhhgtg.m3271Ujhhgtgfeyxiexzf(cls));
        }
        Type[] typeArr = this.f4871Ujhhgtgfeyxiexzf;
        if (typeArr.length != 0) {
            AbstractC2391Ujhhgtgfeyxiexzf.m3650feyxiexzfUjhhgtg(typeArr, sb, ", ", "<", ">", C1379feyxiexzfUjhhgtg.f4873Ujhhgtgfeyxiexzf);
        }
        return sb.toString();
    }

    public final int hashCode() {
        int iHashCode = this.f4869Ujhhgtgfeyxiexzf.hashCode();
        Type type = this.f4870Ujhhgtgfeyxiexzf;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(this.f4871Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        return getTypeName();
    }
}
