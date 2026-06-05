package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳ要点脸ᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1313feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4792Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ObjectReaderBaseModule.ReaderAnnotationProcessor f4793Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f4794Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f4795Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1313feyxiexzfUjhhgtg(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, Annotation annotation, BeanInfo beanInfo, int i) {
        this.f4792Ujhhgtgfeyxiexzf = i;
        this.f4793Ujhhgtgfeyxiexzf = readerAnnotationProcessor;
        this.f4794Ujhhgtgfeyxiexzf = annotation;
        this.f4795Ujhhgtgfeyxiexzf = beanInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4792Ujhhgtgfeyxiexzf) {
            case 0:
                this.f4793Ujhhgtgfeyxiexzf.lambda$processJacksonJsonDeserializer$5(this.f4794Ujhhgtgfeyxiexzf, this.f4795Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            default:
                this.f4793Ujhhgtgfeyxiexzf.lambda$getBeanInfo1x$7(this.f4794Ujhhgtgfeyxiexzf, this.f4795Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }
}
