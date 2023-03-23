package PrototypePattern.deepclone;

import java.io.Serializable;

/***
 * @author dep
 * @version 1.0
 * @date 2023-03-23 12:37
 */
public class DeepCloneableTarget implements Serializable, Cloneable {
    private static final long serialVersionUID= 1L;
    private String cloneName;
    private String cloneClass;

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    // 该类的属性都是String，使用默认的clone方法就行
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
