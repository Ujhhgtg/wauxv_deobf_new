package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ能不能ᛳ要点脸ᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1310feyxiexzfUjhhgtg implements Consumer {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f4780Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f4781Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ Object f4782Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ Object f4783Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1310feyxiexzfUjhhgtg(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, Annotation annotation, FieldInfo fieldInfo) {
        this.f4780Ujhhgtgfeyxiexzf = 1;
        this.f4782Ujhhgtgfeyxiexzf = readerAnnotationProcessor;
        this.f4781Ujhhgtgfeyxiexzf = annotation;
        this.f4783Ujhhgtgfeyxiexzf = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f4780Ujhhgtgfeyxiexzf) {
            case 0:
                ObjectReaderBaseModule.lambda$getBeanInfo1xJSONPOJOBuilder$4(this.f4781Ujhhgtgfeyxiexzf, (BeanInfo) this.f4782Ujhhgtgfeyxiexzf, (Class) this.f4783Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 1:
                ((ObjectReaderBaseModule.ReaderAnnotationProcessor) this.f4782Ujhhgtgfeyxiexzf).lambda$processJacksonJsonDeserialize$10(this.f4781Ujhhgtgfeyxiexzf, (FieldInfo) this.f4783Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            case 2:
                ((ObjectWriterBaseModule.WriterAnnotationProcessor) this.f4783Ujhhgtgfeyxiexzf).lambda$processJacksonJsonSerialize$2(this.f4781Ujhhgtgfeyxiexzf, (BeanInfo) this.f4782Ujhhgtgfeyxiexzf, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonPropertyOrder$4(this.f4781Ujhhgtgfeyxiexzf, (BeanInfo) this.f4782Ujhhgtgfeyxiexzf, (AtomicBoolean) this.f4783Ujhhgtgfeyxiexzf, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C1310feyxiexzfUjhhgtg(ObjectWriterBaseModule.WriterAnnotationProcessor writerAnnotationProcessor, Annotation annotation, BeanInfo beanInfo) {
        this.f4780Ujhhgtgfeyxiexzf = 2;
        this.f4783Ujhhgtgfeyxiexzf = writerAnnotationProcessor;
        this.f4781Ujhhgtgfeyxiexzf = annotation;
        this.f4782Ujhhgtgfeyxiexzf = beanInfo;
    }

    public /* synthetic */ C1310feyxiexzfUjhhgtg(Annotation annotation, BeanInfo beanInfo, Serializable serializable, int i) {
        this.f4780Ujhhgtgfeyxiexzf = i;
        this.f4781Ujhhgtgfeyxiexzf = annotation;
        this.f4782Ujhhgtgfeyxiexzf = beanInfo;
        this.f4783Ujhhgtgfeyxiexzf = serializable;
    }
}
