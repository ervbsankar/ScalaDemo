package Java;/* Example on Comparable */

public class ObjectOrdering implements Comparable<ObjectOrdering> {
    private final String first, last;

    public ObjectOrdering(String first, String last) {
        if (first == null || last == null) throw new NullPointerException();
        {
            this.first = first;
            this.last = last;
        }
    }

    public String first() {
        return first;
    }

    public String last() {
        return last;
    }

    public boolean equals(Object o) {
        if (!(o instanceof ObjectOrdering))
            return false;
        ObjectOrdering objectOrdering = (ObjectOrdering) o;
        System.out.println("equals() --");
        return objectOrdering.equals(first) && objectOrdering.equals(last);
    }

    public int hashCode(){
        System.out.println("hashCode() --");
        return 31*first.hashCode()+ last.hashCode();
    }

    public String toString(){
        return first() + " " + last();
    }

    @Override
    public int compareTo(ObjectOrdering objectOrdering) {
        System.out.println("compareTo() --");
        int lastCmp = last.compareTo(objectOrdering.last);
        return (lastCmp !=0 ? lastCmp : first.compareTo(objectOrdering.first));
    }
}
