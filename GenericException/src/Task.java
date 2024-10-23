public interface Task
{
    void run() throws Exception;
    static <T extends Throwable> void throwAs(Throwable t) throws T
    {
        throw (T) t;
    }
}
