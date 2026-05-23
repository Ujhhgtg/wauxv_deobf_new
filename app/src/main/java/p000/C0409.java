package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᤞᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0409 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1923;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f1924;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f1925;

    public /* synthetic */ C0409(BeanInfo beanInfo, Annotation annotation, int i) {
        this.f1923 = i;
        this.f1925 = beanInfo;
        this.f1924 = annotation;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1923) {
            case 0:
                BeanUtils.lambda$isWriteEnumAsJavaBean$0(this.f1925, this.f1924, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$processJacksonJsonInclude$0(this.f1924, this.f1925, (Method) obj);
                break;
            case 2:
                BeanUtils.lambda$processJacksonJsonTypeName$0(this.f1924, this.f1925, (Method) obj);
                break;
            case 3:
                BeanUtils.lambda$processJacksonJsonFormat$1(this.f1924, this.f1925, (Method) obj);
                break;
            case 4:
                ObjectReaderBaseModule.lambda$getCreator$1(this.f1924, this.f1925, (Method) obj);
                break;
            case 5:
                ObjectReaderBaseModule.lambda$getCreator$2(this.f1924, this.f1925, (Method) obj);
                break;
            case 6:
                ObjectReaderBaseModule.lambda$getCreator$0(this.f1924, this.f1925, (Method) obj);
                break;
            case 7:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonTypeInfo$0(this.f1924, this.f1925, (Method) obj);
                break;
            case 8:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processSeeAlsoAnnotation$0(this.f1924, this.f1925, (Method) obj);
                break;
            case 9:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonSubTypes$0(this.f1924, this.f1925, (Method) obj);
                break;
            case 10:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonIgnoreProperties$0(this.f1924, this.f1925, (Method) obj);
                break;
            case 11:
                BeanUtils.processJSONType1x(this.f1925, this.f1924, (Method) obj);
                break;
            case 12 /* 12 */:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonSubTypes$0(this.f1924, this.f1925, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonTypeInfo$0(this.f1924, this.f1925, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C0409(Annotation annotation, BeanInfo beanInfo, int i) {
        this.f1923 = i;
        this.f1924 = annotation;
        this.f1925 = beanInfo;
    }
}
