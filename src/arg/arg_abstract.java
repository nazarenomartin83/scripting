/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arg;





/**
 *
 * @author nazareno
 */
public abstract class arg_abstract implements arg
{
    protected String msg;
    protected String parameter;
    public abstract void run();
    public void setParameter(String argument)
    {
        this.parameter = argument;
    }
    public String getResult()
    {
        return this.msg;
    }
}
