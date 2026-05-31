package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONPath;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
final class JSONPathSingleIndex extends JSONPathSingle {
    final int index;
    final JSONPathSegmentIndex segment;

    public JSONPathSingleIndex(String str, JSONPathSegmentIndex jSONPathSegmentIndex, JSONPath.Feature... featureArr) {
        super(jSONPathSegmentIndex, str, featureArr);
        this.segment = jSONPathSegmentIndex;
        this.index = jSONPathSegmentIndex.index;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public Object eval(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            if (this.index < list.size()) {
                return list.get(this.index);
            }
            return null;
        }
        JSONPath.Context context = new JSONPath.Context(this, null, this.segment, null, 0L);
        context.root = obj;
        this.segment.eval(context);
        return context.value;
    }

    @Override // com.alibaba.fastjson2.JSONPathSingle, com.alibaba.fastjson2.JSONPath
    public Object extract(JSONReader jSONReader) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        int iStartArray = jSONReader.startArray();
        boolean z = jSONReader.jsonb;
        if (z && this.index >= iStartArray) {
            return null;
        }
        if (!z && jSONReader.nextIfArrayEnd()) {
            return null;
        }
        for (int i = 0; i < this.index && i < iStartArray; i++) {
            jSONReader.skipValue();
            if (!jSONReader.jsonb && jSONReader.nextIfArrayEnd()) {
                return null;
            }
        }
        return jSONReader.readAny();
    }
}
