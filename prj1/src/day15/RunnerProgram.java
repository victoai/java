package day15;

class RunnerProgram{   
    public   Runnable r ;

    public  void setR(  Runnable r ) {
        this.r = r; 
   }   
    public void myRun  (  ) {
                System.out.println( "당신의 프로그램을 실행시켜 드립니다" );
                r.run();
   }
  
  public static void  main(String[] args ) {
              RunnerProgram p = new RunnerProgram();
//              p.setR( new Runnable( ){
//
//				@Override
//				public void run() {
//					
//					System.out.println("내 프로그램의 시작입니다");
//				}}    ) ; //<= 인터페이스를 구현한 객체를 넘겨줘야 한다.
              p.myRun( ); // 
  }
 
}