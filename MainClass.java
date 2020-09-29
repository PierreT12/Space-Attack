package Ch55;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javafx.animation.Animation;
import javafx.animation.AnimationTimer;
import javafx.animation.Interpolator;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Shape;
import javafx.scene.shape.VLineTo;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;


public class MainClass extends Application
{
	//UI
	Scene scene;
	Scene winner;
	Pane p;
	VBox vb;
	HBox hb;
	
	//Number and Bools
	
	boolean collisions;
	boolean bulletcollision;
	boolean bulletcollision2;
	
	boolean done1;
	boolean done2;
	boolean done3;
	boolean done4;
	
	//Characters
	Circle mainplayer;
	Circle uwu;
	
	Circle enemy_small;
	Circle enemy2;
	Circle enemy3;
	Circle enemy4;
	
	Circle enemybull1;
	Circle enemybull2;
	Circle enemybull3;
	Circle enemybull4;
	
	int hiten1;
	int hiten2;
	int hiten3;
	int hiten4;
	
	int finalscore;
	
	long counter = 0;
	
	
	
	//Images
	Image enemyimg = new Image("file:///C:/Users/STEAM/eclipse-workspace/Final project test/src/Ch55/starbase-tex.png");
	Image playerimg = new Image("file:///C:/Users/STEAM/eclipse-workspace/Final project test/src/Ch55/spaceship-removebg-preview.png");
	Image back = new Image("file:///C:/Users/STEAM/eclipse-workspace/Final project test/src/Ch55/space.jpg");
	Image icon = new Image("file:///C:/Users/STEAM/eclipse-workspace/Final project test/src/Ch55/Icon.png");
	
	BackgroundSize backgroundSize = new BackgroundSize(1.0, 1.0, true, true, false, false);
	BackgroundImage bgimage = new BackgroundImage(back, 
            BackgroundRepeat.REPEAT, 
            BackgroundRepeat.NO_REPEAT, 
            BackgroundPosition.DEFAULT, 
            backgroundSize); 
	
	
	public static void main(String[] args) 
	{
		launch(args);
		
		
	}

	public void start(Stage stage)
	{
		
	
		////Don't put any method that uses characters above it//////
		////////////////////////////////////////////
		////////////Calling methods/////////////////
		////////////////////////////////////////////
		CreateUI();
		createStage(stage);
		WinLoseTimer(stage);
		/////////////////////////////////////////////
		/////////////////////////////////////////////
		/////////////////////////////////////////////
	
		
		
		
	}

	

	public void CreateUI() 
	{
		//Pane
		p = new Pane();
		vb = new VBox();
		hb = new HBox();
		
		p.setMinSize(450,450);
		p.setBackground(new Background(bgimage));
		
			
				
		//Boxes
		
		hb.setMinSize(450,55);
		hb.setBackground(new Background(new BackgroundFill(Color.rgb(150,80,75),null,null)));
		hb.setPadding(new Insets(15,15,15,15));
				
		
		vb.setPadding(new Insets(10,10,10,10));
		vb.setSpacing(15);
		//vb.getChildren().addAll();
		
		
		
		scene = new Scene(p);
		
		////////////////////
		//More Methods/////
		//////////////////
		CreateCharacters();
		/////////////////
		////////////////
		///////////////
		
		
		
		
		scene.setOnKeyPressed(new EventHandler<KeyEvent>()
		{
			public void handle(KeyEvent event)
			{
				switch(event.getCode())
				{
				case LEFT:
					mainplayer.setCenterX(mainplayer.getCenterX()- 10);
					
					break;
				case RIGHT:
					mainplayer.setCenterX(mainplayer.getCenterX()+ 10);
					
					break;
				case SPACE:
					Shootyshooty();
					break;
					//No default
				}//End of Switch
			}//End of Handle 
		});//End of OnKeyPressed
		
		
		////////////////////////////////////////	
		///////Kinda Working Hit Detection//////
		////For mainplayer//////////////////////
		///////////////////////////////////////
		AnimationTimer check = new AnimationTimer()
		{
			public void handle(long now)
			{
				
				
				collisions = false;
				Shape OwO = Shape.intersect(mainplayer, enemy_small);
				Shape OwO2 = Shape.intersect(mainplayer, enemy2);
				Shape OwO3 = Shape.intersect(mainplayer, enemy3);
				Shape OwO4 = Shape.intersect(mainplayer, enemy4);
				  
				///////////////////////////
				//Body-slammed by Enemy 1//
				//////////////////////////
				
				
				if (OwO.getBoundsInParent().getWidth() > 0 )
				{
					collisions = true;
					
				}
				
				if (collisions)
				{
					
					
					
				}
				else
				{
					
				}
				
				///////////////////////////
				//Body-slammed by Enemy 2//
				//////////////////////////
				
				
				if (OwO2.getBoundsInParent().getWidth() > 0 )
				{
					collisions = true;
					
					
				}
				
				if (collisions)
				{
					
					
				}
				else
				{
					
				}
				 
				///////////////////////////
				//Body-slammed by Enemy 3//
				//////////////////////////
				
				
				
				if (OwO3.getBoundsInParent().getWidth() > 0 )
				{
					collisions = true;
					
				}
				
				if (collisions)
				{
					
					
				}
				else
				{
					
				}
				
				///////////////////////////
				//Body-slammed by Enemy 4//
				//////////////////////////
				
				
				if (OwO4.getBoundsInParent().getWidth() > 0 )
				{
					collisions = true;
					
				}
				
				if (collisions)
				{
					
					
				}
				else
				{
					
				}
				
			}
			
		};
		check.start();

		if (collisions)
		{
			check.stop();
			
		}
		//////////////////////////////////////////////
		//////////////////////////////////////////////
		//////////////////////////////////////////////  
		
		
		
		
		
		/////////////////////////////////////////////
		///////Timer for Bullet Fire/////////////////
		/////////////////////////////////////////////
	
		AnimationTimer check2 = new AnimationTimer()
		{
		public void handle(long now)
		{
			counter++;
			//////////////////////
			///////Enemy #1//////
			////////////////////
			
			if  (counter == 175)
			{
				if(hiten1 >= 10)
				{
					finalscore++;
				}
				else
				{
					EnemyBulletfire();
				}
				
				
				
			}
			///////////////////////
			///////////////////////
			//////////////////////
			
			//////////////////////
			///////Enemy #2//////
			////////////////////
	
			if  (counter == 150)
			{
				if(hiten2 >= 10)
				{
					finalscore++;
				}
				else
				{
					EnemyBulletfire2();
				}
				
		
			}
			///////////////////////
			///////////////////////
			//////////////////////
			
			
			//////////////////////
			///////Enemy #3//////
			////////////////////

			if  (counter == 225)
			{
				if(hiten3 >= 10)
				{
					finalscore++;
				}
				else
				{
					EnemyBulletfire3();
				}
				
				

			}
			///////////////////////
			///////////////////////
			//////////////////////
			
			
			//////////////////////
			///////Enemy #4//////
			////////////////////

			if  (counter == 250)
			{
				if(hiten4 >= 10)
				{
					finalscore++;
				}
				else
				{
					EnemyBulletfire4();
				}
				
				
			}
			///////////////////////
			///////////////////////
			//////////////////////
			if  (counter == 300)
			{
				enemy_small.setCenterY(enemy_small.getCenterY()+10);
				enemy2.setCenterY(enemy2.getCenterY()+10);
				enemy3.setCenterY(enemy3.getCenterY()+10);
				enemy4.setCenterY(enemy4.getCenterY()+10);
				
				counter = 0;
			}
			
			
		}
				
		}; 
		check2.start();
	
		if(bulletcollision == true)
		{
			check2.stop();
		}
		
	
		
		
	}

	public void WinLoseTimer(Stage stage)
	{
		/////////////////////////////////////////////
		/////Constant check for Win condition &/////
		/////////////Lose condition/////////////////
		///////////////////////////////////////////

		AnimationTimer winlose = new AnimationTimer()
		{
			public void handle (long now)
				{
				
					//////////////////////
					//////Win////////////
					////////////////////

				if(finalscore == 7 && done1 == true && done2 == true && done3 == true && done4 == true)
				{
					ImageView test = new ImageView(icon);
					
					Alert youwon = new Alert(Alert.AlertType.INFORMATION);
					
					youwon.setGraphic(test);
					
					test.setFitHeight(48);
					test.setFitWidth(48);
					
					youwon.setHeaderText("You Won!!!!");
					youwon.setContentText("Congrats you won the game!");
					finalscore = 0;
					youwon.setOnHidden(e -> Platform.exit());
					youwon.show();
					stage.close();
					
				}
				
				if(bulletcollision == true)
				{
					ImageView test = new ImageView(icon);
					
					Alert youlost = new Alert(Alert.AlertType.WARNING);
					
					youlost.setGraphic(test);
					
					test.setFitHeight(48);
					test.setFitWidth(48);
					
					
					youlost.setHeaderText("You Lost!!!!");
					youlost.setContentText("Sorry, you lost. Try again next time （πーπ）");
					bulletcollision = false;
					youlost.setOnHidden(e -> Platform.exit());
					youlost.show();
					stage.close();
					
				}
				
				if(enemy_small.getCenterY() > 330 || enemy2.getCenterY() > 330 ||  enemy3.getCenterY() > 330 || enemy4.getCenterY() > 330 )
				{
					ImageView test = new ImageView(icon);
					
					Alert youlost = new Alert(Alert.AlertType.WARNING);
					
					youlost.setGraphic(test);
					
					test.setFitHeight(48);
					test.setFitWidth(48);
					
					
					youlost.setHeaderText("You Lost!!!!");
					youlost.setContentText("Sorry, you lost. "
							+ "\nThey got too close."
							+ "\n Try again next time （πーπ）");
					
					enemy_small.setCenterY(0);
					enemy2.setCenterY(0);
					enemy3.setCenterY(0);
					enemy4.setCenterY(0);
					
					youlost.setOnHidden(e -> Platform.exit());
					youlost.show();
					stage.close();
				}
				
			
			}

		};
		winlose.start();
		
			
	}
	
	public void CreateCharacters() 
	{
		mainplayer = new Circle(230,380,20);
		mainplayer.setFill(new ImagePattern(playerimg));
		
		 
		enemy_small = new Circle (50, 50, 20);
		enemy_small.setFill(new ImagePattern(enemyimg));
		
		
		enemy2 = new Circle(150, 50, 20);
		enemy2.setFill(new ImagePattern(enemyimg));
		
		
		enemy3 = new Circle(450, 50, 20);
		enemy3.setFill(new ImagePattern(enemyimg));
		
		
		enemy4 = new Circle(300, 50, 20);
		enemy4.setFill(new ImagePattern(enemyimg));
		
	    collisions = false;
	    
	     done1 = false;
		 done2 = false;
		 done3 = false;
		 done4 = false;
		
		p.getChildren().addAll(enemy_small, mainplayer, enemy2, enemy3, enemy4 );
		 
		 
	}
	
	
	/////////////////////////////////
	//////////Mainplayer Bullet//////
	/////////////////////////////////
	
	public void Shootyshooty() 
	{
		
		
		
		uwu = new Circle(mainplayer.getCenterX(), mainplayer.getCenterY(), 4);
		uwu.setFill(Color.rgb(0, 180, 0));
	
		
		KeyValue tester = new KeyValue(uwu.centerYProperty(), -20, new Interpolator() {
			protected double curve (double q)
			{
				bulletcollision2 = false;
				Shape bullethit = Shape.intersect(uwu, enemy_small);
				Shape bullehit2 = Shape.intersect(uwu, enemy2);
				Shape bullehit3 = Shape.intersect(uwu, enemy3);
				Shape bullehit4 = Shape.intersect(uwu, enemy4);
				
				
				//////////////////////////////
				////Hitting Enemy 1///////////
				/////////////////////////////
				
				if (bullethit.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision2 = true;
					hiten1 ++;
					if(hiten1 >= 10)
					{
						p.getChildren().remove(enemy_small);
						done1 = true;
					}
				}
				else
				{
					
				}
				
				//////////////////////////////
				////Hitting Enemy 2///////////
				/////////////////////////////
				
				
				if (bullehit2.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision2 = true;
					hiten2 ++;
					if(hiten2 >= 10)
					{
						p.getChildren().remove(enemy2);
						done2 = true;
					}
				}
				else
				{
					
				}
				
				//////////////////////////////
				////Hitting Enemy 3///////////
				/////////////////////////////
				
				if (bullehit3.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision2 = true;
					hiten3 ++;
					if(hiten3 >= 10)
					{
						p.getChildren().remove(enemy3);
						done3 = true;
					}
				}
				else
				{
					
				}
				
				//////////////////////////////
				////Hitting Enemy 4///////////
				/////////////////////////////
				
				if (bullehit4.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision2 = true;
					
					hiten4 ++;
					if(hiten4 >= 10)
					{
						p.getChildren().remove(enemy4);
						done4 = true;
						
					}
				}
				else
				{
					
				}
				
				return q;
			}
			
		});
		
		
		KeyFrame bullkeyfra = new KeyFrame(Duration.millis(1000), tester);
		Timeline timeline  = new Timeline();
		timeline.setCycleCount(1);
		timeline.setAutoReverse(false);
		timeline.getKeyFrames().addAll(bullkeyfra); 
		timeline.play();
		p.getChildren().addAll(uwu);
	
		
	}
	//////////////////////////////////
	//////////////////////////////////
	//////////////////////////////////
	
	
	

	
	public void EnemyBulletfire() 
	{
		enemybull1 = new Circle(enemy_small.getCenterX(),enemy_small.getCenterY(), 4);
		enemybull1.setFill(Color.rgb(180, 0, 0));
		
		KeyValue tester2 = new KeyValue(enemybull1.centerYProperty(), 550, new Interpolator() {
			protected double curve (double w)
			{
				Shape bullethit2 = Shape.intersect(enemybull1, mainplayer);
				if (bullethit2.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision = true;
					
					
				}
				else
				{
					
				}
				return w;
			}
			
		});
		
		
		KeyFrame bullkeyfra2 = new KeyFrame(Duration.millis(1000), tester2);
		Timeline timeline2  = new Timeline();
		timeline2.setCycleCount(1);
		timeline2.setAutoReverse(false);
		timeline2.getKeyFrames().addAll(bullkeyfra2); 
		timeline2.play();
		p.getChildren().addAll(enemybull1);
		
		
		
	}
	

	public void EnemyBulletfire2() 
	{
		enemybull2 = new Circle(enemy2.getCenterX(),enemy2.getCenterY(), 4);
		enemybull2.setFill(Color.rgb(180, 0, 0));
		KeyValue tester2 = new KeyValue(enemybull2.centerYProperty(), 550, new Interpolator() {
			protected double curve (double w)
			{
				
				Shape bullethit2 = Shape.intersect(enemybull2, mainplayer);
				if (bullethit2.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision = true;
					
					
				}
				else
				{
					
				}
				return w;
			}
			
		});
		
		
		KeyFrame bullkeyfra2 = new KeyFrame(Duration.millis(1000), tester2);
		Timeline timeline2  = new Timeline();
		timeline2.setCycleCount(1);
		timeline2.setAutoReverse(false);
		timeline2.getKeyFrames().addAll(bullkeyfra2); 
		timeline2.play();
		p.getChildren().addAll(enemybull2);
		
		
		
	}
		
	
	public void EnemyBulletfire3() 
	{
		enemybull3 = new Circle(enemy3.getCenterX(),enemy3.getCenterY(), 4);
		enemybull3.setFill(Color.rgb(180, 0, 0));
		KeyValue tester2 = new KeyValue(enemybull3.centerYProperty(), 550, new Interpolator() {
			protected double curve (double w)
			{
				
				Shape bullethit2 = Shape.intersect(enemybull2, mainplayer);
				if (bullethit2.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision = true;
					
				}
				else
				{
					
				}
				return w;
			}
			
		});
		
		
		KeyFrame bullkeyfra2 = new KeyFrame(Duration.millis(1000), tester2);
		Timeline timeline2  = new Timeline();
		timeline2.setCycleCount(1);
		timeline2.setAutoReverse(false);
		timeline2.getKeyFrames().addAll(bullkeyfra2); 
		timeline2.play();
		p.getChildren().addAll(enemybull3);
		
		
		
	}
	
	
	public void EnemyBulletfire4() 
	{
		enemybull4 = new Circle(enemy4.getCenterX(),enemy4.getCenterY(), 4);
		enemybull4.setFill(Color.rgb(180, 0, 0));
		KeyValue tester2 = new KeyValue(enemybull4.centerYProperty(), 550, new Interpolator() {
			protected double curve (double w)
			{
				Shape bullethit2 = Shape.intersect(enemybull4, mainplayer);
				if (bullethit2.getBoundsInParent().getWidth() > 0)
				{
					bulletcollision = true;
					
					
				}
				else
				{
					
				}
				return w;
			}
			
		});
		
		
		KeyFrame bullkeyfra2 = new KeyFrame(Duration.millis(1000), tester2);
		Timeline timeline2  = new Timeline();
		timeline2.setCycleCount(1);
		timeline2.setAutoReverse(false);
		timeline2.getKeyFrames().addAll(bullkeyfra2); 
		timeline2.play();
		p.getChildren().addAll(enemybull4);
		
		
		
	}
	
	

	

	
	private void createStage(Stage stage)
	{
		ImageView test = new ImageView(icon);
		stage = new Stage();
		
		stage.setScene(scene);
		stage.setWidth(520);
		stage.setHeight(520);
		stage.setTitle("Project Final: Take down the Aliens");
		
		Alert gameostart = new Alert(Alert.AlertType.INFORMATION);
		gameostart.setHeaderText("Game Instructions");
		gameostart.setGraphic(test);
		
		test.setFitHeight(48);
		test.setFitWidth(48);
		
		stage.getIcons().add(icon);
		gameostart.setContentText("Use the left and right arrows to move and the Spacebar to shoot!"
				+ "\nYour goal is to shoot all the aliens."
				+ "\nIf they get to close, you lose. "
				+ "\nThey each have two health and you have one."
				+ "\nGood luck!");
		gameostart.showAndWait();
		stage.show();
	}

	
}