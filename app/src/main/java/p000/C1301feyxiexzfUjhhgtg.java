package p000;

import com.alibaba.fastjson2.reader.FieldReader;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛲ要点脸ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1301feyxiexzfUjhhgtg implements ToLongFunction {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4745Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1301feyxiexzfUjhhgtg(int i) {
        this.f4745Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.function.ToLongFunction
    public final long applyAsLong(Object obj) {
        FieldReader fieldReader = (FieldReader) obj;
        switch (this.f4745Ujhhgtgfeyxiexzf) {
            case 0:
                return fieldReader.fieldNameHash;
            default:
                return fieldReader.fieldNameHashLCase;
        }
    }
}
