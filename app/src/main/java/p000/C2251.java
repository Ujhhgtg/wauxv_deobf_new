package p000;

import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderCreator;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.function.Consumer;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2251 implements Consumer {

    public final /* synthetic */ int f7284 = 1;

    public final /* synthetic */ ObjectReaderCreator f7285;

    public final /* synthetic */ FieldInfo f7286;

    public final /* synthetic */ long f7287;

    public final /* synthetic */ Class f7288;

    public final /* synthetic */ Type f7289;

    public final /* synthetic */ String f7290;

    public final /* synthetic */ String[] f7291;

    public final /* synthetic */ LinkedHashMap f7292;

    public final /* synthetic */ ObjectReaderProvider f7293;

    public final /* synthetic */ Object f7294;

    public /* synthetic */ C2251(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, Class cls, Type type, String str, String[] strArr, BeanInfo beanInfo, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f7285 = objectReaderCreator;
        this.f7286 = fieldInfo;
        this.f7287 = j;
        this.f7288 = cls;
        this.f7289 = type;
        this.f7290 = str;
        this.f7291 = strArr;
        this.f7294 = beanInfo;
        this.f7292 = linkedHashMap;
        this.f7293 = objectReaderProvider;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (1) {
            case 0:
                this.f7285.lambda$createFieldReaders$0(this.f7286, this.f7287, this.f7290, this.f7288, this.f7289, (String) this.f7294, this.f7291, this.f7292, this.f7293, (Field) obj);
                break;
            default:
                this.f7285.lambda$createFieldReaders$3(this.f7286, this.f7287, this.f7288, this.f7289, this.f7290, this.f7291, (BeanInfo) this.f7294, this.f7292, this.f7293, (Method) obj);
                break;
        }
    }

    public /* synthetic */ C2251(ObjectReaderCreator objectReaderCreator, FieldInfo fieldInfo, long j, String str, Class cls, Type type, String str2, String[] strArr, LinkedHashMap linkedHashMap, ObjectReaderProvider objectReaderProvider) {
        this.f7285 = objectReaderCreator;
        this.f7286 = fieldInfo;
        this.f7287 = j;
        this.f7290 = str;
        this.f7288 = cls;
        this.f7289 = type;
        this.f7294 = str2;
        this.f7291 = strArr;
        this.f7292 = linkedHashMap;
        this.f7293 = objectReaderProvider;
    }
}
