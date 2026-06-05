package com.alibaba.fastjson2.filter;

import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class Labels {

    /* JADX INFO: compiled from: obf */
    public static class DefaultLabelFilter implements LabelFilter {
        final String[] excludes;
        final String[] includes;

        public DefaultLabelFilter(String[] strArr, String[] strArr2) {
            if (strArr != null) {
                String[] strArr3 = new String[strArr.length];
                this.includes = strArr3;
                System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                Arrays.sort(strArr3);
            } else {
                this.includes = null;
            }
            if (strArr2 == null) {
                this.excludes = null;
                return;
            }
            String[] strArr4 = new String[strArr2.length];
            this.excludes = strArr4;
            System.arraycopy(strArr2, 0, strArr4, 0, strArr2.length);
            Arrays.sort(strArr4);
        }

        @Override // com.alibaba.fastjson2.filter.LabelFilter
        public boolean apply(String str) {
            String[] strArr = this.excludes;
            if (strArr != null) {
                return Arrays.binarySearch(strArr, str) < 0;
            }
            String[] strArr2 = this.includes;
            return strArr2 != null && Arrays.binarySearch(strArr2, str) >= 0;
        }
    }

    public static LabelFilter excludes(String... strArr) {
        return new DefaultLabelFilter(null, strArr);
    }

    public static LabelFilter includes(String... strArr) {
        return new DefaultLabelFilter(strArr, null);
    }
}
