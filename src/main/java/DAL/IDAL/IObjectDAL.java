package DAL.IDAL;

public interface IObjectDAL {
    public <T> int insertObject(T object);
    public <T> int updateObject(T object);
    public int removeObject(int objectID);
    public <T> T getAnObjectByID(int objectID);
}
