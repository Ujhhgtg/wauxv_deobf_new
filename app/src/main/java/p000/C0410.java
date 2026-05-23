package p000;

import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriterBaseModule;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᤞᲇᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0410 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1926;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Annotation f1927;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f1928;

    public /* synthetic */ C0410(Annotation annotation, FieldInfo fieldInfo, int i) {
        this.f1926 = i;
        this.f1927 = annotation;
        this.f1928 = fieldInfo;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f1926) {
            case 0:
                BeanUtils.lambda$processGsonSerializedName$0(this.f1927, this.f1928, (Method) obj);
                break;
            case 1:
                BeanUtils.lambda$processJacksonJsonUnwrapped$0(this.f1927, this.f1928, (Method) obj);
                break;
            case 2:
                BeanUtils.lambda$processJacksonJsonInclude$1(this.f1927, this.f1928, (Method) obj);
                break;
            case 3:
                BeanUtils.lambda$processJacksonJsonIgnore$0(this.f1927, this.f1928, (Method) obj);
                break;
            case 4:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonAlias$0(this.f1927, this.f1928, (Method) obj);
                break;
            case 5:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonSetter$0(this.f1927, this.f1928, (Method) obj);
                break;
            case 6:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJSONField1x$0(this.f1927, this.f1928, (Method) obj);
                break;
            case 7:
                ObjectReaderBaseModule.ReaderAnnotationProcessor.lambda$processJacksonJsonProperty$0(this.f1927, this.f1928, (Method) obj);
                break;
            default:
                ObjectWriterBaseModule.WriterAnnotationProcessor.lambda$processJacksonJsonProperty$0(this.f1927, this.f1928, (Method) obj);
                break;
        }
    }
}
