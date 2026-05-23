package p000;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1240 extends AbstractC1928 {

    public InterfaceC1425 f4482;

    public Integer f4485;

    public final ArrayList f4480 = new ArrayList();

    public final ArrayList f4481 = new ArrayList();

    public final LinkedHashSet f4483 = new LinkedHashSet();

    public final LinkedHashSet f4484 = new LinkedHashSet();

    public final LinkedHashSet f4486 = new LinkedHashSet();

    public final LinkedHashSet f4487 = new LinkedHashSet();

    public final LinkedHashSet f4488 = new LinkedHashSet();

    public final LinkedHashSet f4489 = new LinkedHashSet();

    public final LinkedHashSet f4490 = new LinkedHashSet();

    public final LinkedHashSet f4491 = new LinkedHashSet();

    public final ArrayList f4492 = new ArrayList();

    public final ArrayList f4493 = new ArrayList();

    public final LinkedHashSet f4494 = new LinkedHashSet();

    public final LinkedHashSet f4495 = new LinkedHashSet();

    public final LinkedHashSet f4496 = new LinkedHashSet();

    public final LinkedHashSet f4497 = new LinkedHashSet();

    public final LinkedHashSet f4498 = new LinkedHashSet();

    public final LinkedHashSet f4499 = new LinkedHashSet();

    public final LinkedHashSet f4500 = new LinkedHashSet();

    public final LinkedHashSet f4501 = new LinkedHashSet();

    @Override // p000.AbstractC1928
    public Map mo2886() {
        Map mapMo2886 = super.mo2886();
        Map mapM3694 = AbstractC1898.m3694(new C2315("parameters", this.f4480), new C2315("parametersNot", this.f4481), new C2315("parametersCondition", this.f4482), new C2315("parameterCount", this.f4485), new C2315("parameterCountCondition", null), new C2315("typeParameters", this.f4483), new C2315("typeParametersNot", this.f4484), new C2315("exceptionTypes", this.f4486), new C2315("exceptionTypesNot", this.f4487), new C2315("genericExceptionTypes", this.f4488), new C2315("genericExceptionTypesNot", this.f4489), new C2315("genericParameters", this.f4490), new C2315("genericParametersNot", this.f4491), new C2315("isVarArgs", null), new C2315("isVarArgsNot", null), new C2315("parameterAnnotations", this.f4492), new C2315("parameterAnnotationsNot", this.f4493), new C2315("annotatedReturnType", this.f4494), new C2315("annotatedReturnTypeNot", this.f4495), new C2315("annotatedReceiverType", this.f4496), new C2315("annotatedReceiverTypeNot", this.f4497), new C2315("annotatedParameterTypes", this.f4498), new C2315("annotatedParameterTypesNot", this.f4499), new C2315("annotatedExceptionTypes", this.f4500), new C2315("annotatedExceptionTypesNot", this.f4501));
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapMo2886);
        linkedHashMap.putAll(mapM3694);
        return linkedHashMap;
    }

    public final void m2887() {
        this.f4485 = 0;
    }

    public final void paramTypes(Object... objArr) {
        AbstractC0750.m2218(this.f4480, objArr);
    }
}
