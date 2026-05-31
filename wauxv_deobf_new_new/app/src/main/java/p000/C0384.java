package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᲈᤝᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0384 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1895;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f1896;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ BeanInfo f1897;

    public /* synthetic */ C0384(BeanInfo beanInfo, Annotation annotation, int i) {
        this.f1895 = i;
        this.f1897 = beanInfo;
        this.f1896 = annotation;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1895) {
            case 0:
                BeanUtils.lambda$isWriteEnumAsJavaBean$3(this.f1897, this.f1896, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$processJacksonJsonInclude$14(this.f1896, this.f1897, (Method) obj);
                break;
            case 2:
                BeanUtils.lambda$processJacksonJsonTypeName$17(this.f1896, this.f1897, (Method) obj);
                break;
            case 3:
                BeanUtils.lambda$processJacksonJsonFormat$13(this.f1896, this.f1897, (Method) obj);
                break;
            case 4:
                ObjectReaderBaseModule.lambda$getCreator$6(this.f1896, this.f1897, (Method) obj);
                break;
            case 5:
                ObjectReaderBaseModule.lambda$getCreator$7(this.f1896, this.f1897, (Method) obj);
                break;
            case 6:
                ObjectReaderBaseModule.lambda$getCreator$5(this.f1896, this.f1897, (Method) obj);
                break;
            case 7:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonTypeInfo$6(this.f1896, this.f1897, (Method) obj);
                break;
            case 8:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processSeeAlsoAnnotation$8(this.f1896, this.f1897, (Method) obj);
                break;
            case 9:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonSubTypes$4(this.f1896, this.f1897, (Method) obj);
                break;
            case 10:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonIgnoreProperties$7(this.f1896, this.f1897, (Method) obj);
                break;
            case 11:
                BeanUtils.processJSONType1x(this.f1897, this.f1896, (Method) obj);
                break;
            case Opcodes.FCONST_1 /* 12 */:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonSubTypes$1(this.f1896, this.f1897, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonTypeInfo$3(this.f1896, this.f1897, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C0384(Annotation annotation, BeanInfo beanInfo, int i) {
        this.f1895 = i;
        this.f1896 = annotation;
        this.f1897 = beanInfo;
    }
}
