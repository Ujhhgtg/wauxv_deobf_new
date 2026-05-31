package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderBaseModule;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.function.Consumer;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᲁᲇᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2279 implements Consumer {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7389 = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ Class f7390;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ String f7391;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ FieldInfo f7392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ Object f7393;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ Serializable f7394;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ Object f7395;

    public /* synthetic */ C2279(ObjectReaderBaseModule.ReaderAnnotationProcessor readerAnnotationProcessor, String str, FieldInfo fieldInfo, Class cls, String str2, String str3) {
        this.f7393 = readerAnnotationProcessor;
        this.f7391 = str;
        this.f7392 = fieldInfo;
        this.f7390 = cls;
        this.f7394 = str2;
        this.f7395 = str3;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f7389) {
            case 0:
                ((ObjectReaderBaseModule.ReaderAnnotationProcessor) this.f7393).lambda$getFieldInfo$9(this.f7391, this.f7392, this.f7390, (String) this.f7394, (String) this.f7395, (Field) obj);
                break;
            default:
                ObjectReaderCreator.lambda$createObjectReaderWithCreator$1(this.f7390, (ObjectReaderProvider) this.f7393, (Class) this.f7394, (BeanInfo) this.f7395, this.f7391, this.f7392, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2279(Class cls, ObjectReaderProvider objectReaderProvider, Class cls2, BeanInfo beanInfo, String str, FieldInfo fieldInfo) {
        this.f7390 = cls;
        this.f7393 = objectReaderProvider;
        this.f7394 = cls2;
        this.f7395 = beanInfo;
        this.f7391 = str;
        this.f7392 = fieldInfo;
    }
}
