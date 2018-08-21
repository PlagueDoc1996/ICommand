package cmd
interface ICommand : ()-> Unit
{
    override fun invoke()
}