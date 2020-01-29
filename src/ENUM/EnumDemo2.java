package ENUM;


enum ReportStatus{
    PROGRESS(19), FAIL(30), FINISHED(10);
    private int num;

    private ReportStatus(int num){
        this.num=num;
    }
        public int getNum(){
        return  this.num;
    }
}
public class EnumDemo2 {
    public static void main(String[] args) {
        ReportStatus reportStatus= ReportStatus.FAIL;
        System.out.println(reportStatus.getNum());
        foo(ReportStatus.FAIL);
        foo(ReportStatus.PROGRESS);
        foo(ReportStatus.FINISHED);
    }

    static public void foo(ReportStatus reportStatus){
        System.out.println(reportStatus.getNum());
    }
}
