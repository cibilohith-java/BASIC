import java.util.Scanner;
class swiggapplication
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args)throws Exception
		{
		System.out.println("\t\t\twelcome to swigg......");
		System.out.println("choose which restaurants do you want:\n1.A2B\n2.ammahotel\n3.kavinhotel\n4.SShyderabad");
		
		int restaurants=sc.nextInt();
		switch(restaurants){
			case 1:{
				System.out.println("\t\t\tyou are selecting A2B");
				System.out.println("which food do you want:\n1.dosa\n2.idile\n3.pongal");
				int food=sc.nextInt();
				switch(food){
					case 1:{
						double dosa=100;
						System.out.println("dosa:"+dosa);
						Thread.sleep(1000);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(dosa==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										Thread.sleep(1000);
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(dosa==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										Thread.sleep(1000);
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 2:{
						double idile=40;
						System.out.println("idile:"+idile);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(idile==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										Thread.sleep(1000);
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(idile==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										Thread.sleep(1000);
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 3:{
						double pongal=75;
						System.out.println("pongal:"+pongal);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(pongal==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										Thread.sleep(1000);
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(pongal==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					default:{
						System.out.println("\t\t\tyour are exited!....");
					}break;
				}
			}break;
			case 2:{
				System.out.println("\t\t\tyou are selecting ammahotel");
				System.out.println("which food do you want:\n1.dosa\n2.idile\n3.pongal");
				int food=sc.nextInt();
				switch(food){
					case 1:{
						double dosa=50;
						System.out.println("dosa:"+dosa);
						System.out.println(".........processing........");
						Thread.sleep(1000);
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(dosa==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(dosa==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 2:{
						double idile=30;
						System.out.println("idile:"+idile);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(idile==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(idile==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 3:{
						double pongal=60;
						System.out.println("pongal:"+pongal);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(pongal==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(pongal==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					default:{
						System.out.println("\t\t\tyour are exited!....");
					}break;
				}
			}break;
			case 3:{
				System.out.println("\t\t\tyou are selecting kavinhotel");
				System.out.println("which food do you want:\n1.dosa\n2.idile\n3.briyani");
				int food=sc.nextInt();
				switch(food){
					case 1:{
						double dosa=100;
						System.out.println("dosa:100");
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(dosa==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(dosa==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 2:{
						double idile=40;
						System.out.println("idile:"+idile);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(idile==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(idile==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 3:{
						double briyani=175;
						System.out.println("briyani:"+briyani);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(briyani==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(briyani==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					default:{
						System.out.println("\t\t\tyour are exited!....");
					}break;
				}
			}break;
			case 4:{
				System.out.println("\t\t\tyou are selecting SShyderabad");
				System.out.println("which food do you want:\n1.chickbriyani\n2.muttonbriyani\n3.chicken65");
				int food=sc.nextInt();
				switch(food){
					case 1:{
						double chickbriyani=200;
						System.out.println("chickbriyani:"+chickbriyani);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(chickbriyani==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(chickbriyani==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 2:{
						double muttonbriyani=300;
						System.out.println("muttonbriyani:"+muttonbriyani);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(muttonbriyani==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(muttonbriyani==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					case 3:{
						double chicken65=75;
						System.out.println("chicken65:"+chicken65);
						System.out.println(".........processing........");
						System.out.println("1.wanted\n2.exit");
						int payment=sc.nextInt();
						switch(payment){
							case 1:{
								System.out.println("select your payment option:\n1.googlepay\n2.phonepay");
								int paymentoption=sc.nextInt();
								switch(paymentoption){
									case 1:{
										System.out.println("redirecting to googlepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(chicken65==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										Thread.sleep(1000);
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
									case 2:{
										System.out.println("redirecting to phonepay server!....");
										Thread.sleep(1000);
										System.out.print("pay:");
										int pay=sc.nextInt();
										if(chicken65==pay){
											System.out.println("payment sucessful!");
										}
										else{
											System.out.println("wrong payment amount!");
										}
										System.out.println("wait for otp ");
										int otp=(int)(Math.random()*9999+9999);
										System.out.println("your otp number:"+otp);
										System.out.print("enter your otp:");
										Thread.sleep(1000);
										int yourotp=sc.nextInt();
										if(otp==yourotp){
											System.out.println("here your order !");
										}
										else{
											System.out.println("you entered wrong otp !");
										}
									}break;
								}
							}break;
						}
						
					}break;
					default:{
						System.out.println("\t\t\tyour are exited!....");
					}break;
				}
			}break;
			default:{
				System.out.println("Your are exiting it!");
			}
		}
	}
}