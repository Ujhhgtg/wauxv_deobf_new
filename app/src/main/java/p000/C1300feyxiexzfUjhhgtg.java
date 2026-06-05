package p000;

import com.alibaba.fastjson2.reader.ObjectReaderCreatorASM;
import java.util.function.Function;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛲ要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1300feyxiexzfUjhhgtg implements Function {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4743Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Class f4744Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1300feyxiexzfUjhhgtg(int i, Class cls) {
        this.f4743Ujhhgtgfeyxiexzf = i;
        this.f4744Ujhhgtgfeyxiexzf = cls;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.f4743Ujhhgtgfeyxiexzf) {
            case 0:
                return ObjectReaderCreatorASM.lambda$createValueConsumer0$5(this.f4744Ujhhgtgfeyxiexzf, (String) obj);
            case 1:
                return ObjectReaderCreatorASM.lambda$jitObjectReader$2(this.f4744Ujhhgtgfeyxiexzf, (String) obj);
            default:
                return ObjectReaderCreatorASM.lambda$createNoneDefaultConstructorObjectReader$1(this.f4744Ujhhgtgfeyxiexzf, (String) obj);
        }
    }
}
