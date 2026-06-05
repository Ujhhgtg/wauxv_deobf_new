package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳᛴ要点脸ᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1306feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4767Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ ObjectWriterBaseModule.WriterAnnotationProcessor f4768Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f4769Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f4770Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1306feyxiexzfUjhhgtg(ObjectWriterBaseModule.WriterAnnotationProcessor writerAnnotationProcessor, Annotation annotation, FieldInfo fieldInfo, int i) {
        this.f4767Ujhhgtgfeyxiexzf = i;
        this.f4768Ujhhgtgfeyxiexzf = writerAnnotationProcessor;
        this.f4769Ujhhgtgfeyxiexzf = annotation;
        this.f4770Ujhhgtgfeyxiexzf = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4767Ujhhgtgfeyxiexzf) {
            case 0:
                this.f4768Ujhhgtgfeyxiexzf.lambda$processJacksonJsonSerialize$5(this.f4769Ujhhgtgfeyxiexzf, this.f4770Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            default:
                this.f4768Ujhhgtgfeyxiexzf.lambda$processJSONField1x$8(this.f4769Ujhhgtgfeyxiexzf, this.f4770Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }
}
