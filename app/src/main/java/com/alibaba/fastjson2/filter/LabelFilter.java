package com.alibaba.fastjson2.filter;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public interface LabelFilter extends Filter {
    static LabelFilter compose(LabelFilter labelFilter, LabelFilter labelFilter2) {
        if (!(labelFilter instanceof CompositeLabelFilter)) {
            return new CompositeLabelFilter(labelFilter, labelFilter2);
        }
        ((CompositeLabelFilter) labelFilter).add(labelFilter2);
        return labelFilter;
    }

    boolean apply(String str);
}
