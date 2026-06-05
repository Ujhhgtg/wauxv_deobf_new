package p000;

import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.writer.ObjectWriterProvider;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛲᛴᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1298feyxiexzfUjhhgtg implements Predicate {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4738Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Object f4739Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1298feyxiexzfUjhhgtg(int i, Object obj) {
        this.f4738Ujhhgtgfeyxiexzf = i;
        this.f4739Ujhhgtgfeyxiexzf = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f4738Ujhhgtgfeyxiexzf) {
            case 0:
                return ObjectReaderProvider.lambda$cleanup$0((ClassLoader) this.f4739Ujhhgtgfeyxiexzf, (Map.Entry) obj);
            case 1:
                return ObjectReaderProvider.lambda$cleanup$1((ClassLoader) this.f4739Ujhhgtgfeyxiexzf, (Map.Entry) obj);
            case 2:
                return ObjectReaderProvider.lambda$cleanup$2((ClassLoader) this.f4739Ujhhgtgfeyxiexzf, (Map.Entry) obj);
            case 3:
                return ObjectWriterProvider.lambda$cleanup$0((ClassLoader) this.f4739Ujhhgtgfeyxiexzf, (Map.Entry) obj);
            default:
                return ((Field) obj).getType() == ((Class) this.f4739Ujhhgtgfeyxiexzf);
        }
    }
}
