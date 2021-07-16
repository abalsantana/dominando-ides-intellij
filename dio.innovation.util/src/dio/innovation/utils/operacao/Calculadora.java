package dio.innovation.utils.operacao;

import dio.innovation.utils.operacao.Internal.DivHelper;
import dio.innovation.utils.operacao.Internal.MultHelper;
import dio.innovation.utils.operacao.Internal.SubHelper;
import dio.innovation.utils.operacao.Internal.SumHelper;

public class Calculadora {

    private DivHelper divHelper;
    private MultHelper multHelper;
    private SubHelper subHelper;
    private SumHelper sumHelper;


    //Construtor
    public Calculadora(){
        divHelper = new DivHelper();
        multHelper = new MultHelper();
        subHelper = new SubHelper();
        sumHelper = new SumHelper();
    }
    public int sum(int a, int b){
        return sumHelper.execute(a, b);
    }

    public int sub(int a, int b){
        return subHelper.execute(a, b);
    }

    public int mult(int a, int b){
        return multHelper.execute(a, b);
    }

    public int div(int a, int b){
        return divHelper.execute(a, b);
    }

}
