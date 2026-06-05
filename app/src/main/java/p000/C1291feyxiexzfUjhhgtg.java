package p000;

import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import java.util.function.BiConsumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛱUjhhgtgᛱᛲ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1291feyxiexzfUjhhgtg implements BiConsumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4708Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1291feyxiexzfUjhhgtg(int i) {
        this.f4708Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        switch (this.f4708Ujhhgtgfeyxiexzf) {
            case 0:
                ((Throwable) obj).setStackTrace((StackTraceElement[]) obj2);
                break;
            default:
                ObjectReaderCreator.lambda$createFieldReaders$6(obj, obj2);
                break;
        }
    }
}
