package com.qc.designmode.other.delegate.jvmparent;

/**
 * @author qc
 * @date 2019/12/16
 * @description
 * @project JavaDesignMode
 * @solving
 */
public abstract class GetClass {
    private GetClass parent;

    public void setParent(GetClass getClass) {
        this.parent = getClass;
    }
    public Class<?> loadClass(String name) {
        System.out.println(getClass().getName() + "------>Load");
        Class c = null;
        if (parent != null) {
            c = this.parent.loadClass(name);
        }
        if (c != null) {
            return c;
        } else {
            return findClass(name);
        }
    }
    public abstract Class<?> findClass(String name);
}
