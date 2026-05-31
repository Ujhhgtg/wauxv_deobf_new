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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲇᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2277 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7384;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f7385;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f7386;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ Object f7387;

    public /* synthetic */ C2277(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, Annotation annotation, FieldInfo fieldInfo) {
        this.f7384 = 1;
        this.f7386 = readerAnnotationProcessor;
        this.f7385 = annotation;
        this.f7387 = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7384) {
            case 0:
                ObjectReaderBaseModule.lambda$getBeanInfo1xJSONPOJOBuilder$4(this.f7385, (BeanInfo) this.f7386, (Class) this.f7387, (Method) obj);
                break;
            case 1:
                ((ObjectReaderBaseModule.ReaderAnnotationProcessor) this.f7386).lambda$processJacksonJsonDeserialize$10(this.f7385, (FieldInfo) this.f7387, (Method) obj);
                break;
            case 2:
                ((ObjectWriterBaseModule.WriterAnnotationProcessor) this.f7387).lambda$processJacksonJsonSerialize$2(this.f7385, (BeanInfo) this.f7386, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonPropertyOrder$4(this.f7385, (BeanInfo) this.f7386, (AtomicBoolean) this.f7387, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2277(ObjectWriterBaseModule.WriterAnnotationProcessor writerAnnotationProcessor, Annotation annotation, BeanInfo beanInfo) {
        this.f7384 = 2;
        this.f7387 = writerAnnotationProcessor;
        this.f7385 = annotation;
        this.f7386 = beanInfo;
    }

    public /* synthetic */ C2277(Annotation annotation, BeanInfo beanInfo, Serializable serializable, int i) {
        this.f7384 = i;
        this.f7385 = annotation;
        this.f7386 = beanInfo;
        this.f7387 = serializable;
    }
}
