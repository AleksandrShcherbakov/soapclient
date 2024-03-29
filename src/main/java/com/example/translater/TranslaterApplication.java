package com.example.translater;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.Set;

@SpringBootApplication
public class TranslaterApplication {

	public static void main(String[] args) throws IOException, SocketTimeoutException {
		//SpringApplication.run(TranslaterApplication.class, args);
		System.out.println(Helper.createTranscriptionAndTranslate("warms"));
		//Set<String> stringSet = XmlFb2.createStringSet("C://111.fb2");
		String str = "From about 1930 until very recent times the cinema enjoyed great popularity in Britain. The first cinemas were the most impressive buildings in the street of many towns. Later, the rapid spread of television brought a great change. The number of cinema -goers dropped and, as a result, 1,500 cinemas were closed. Many of the films were mostly imported from America. Some films were shot in Britain and often directed by British directors, but with American money. The British cinematography was not able to provide the cinema houses with films of its own production.\n" +
				"\n" +
				"It was only during World War II and after that the British producers began to make their own films. In this way they voiced their protest against Britain’s dependence on American cinema. A glimpse of hope was seen in such productions as «Hamlet», produced by Laurence Oliver, «Great Expectations» and «Oliver Twist» by U. Lynn, and more recently in «Room at the Top»,-«Look Back in Anger», a number of TV plays, serials and documentaries.\n" +
				"\n" +
				"But still the great majority of films dominating the British screen are Hollywood production. Among them are American-made thrillers, westerners, spy-films, horror-films, which have their influence on the British youth. The cinema monopolies are little concerned with the ill-effects of such films as long as they bring in profits. Commercial art which can be cheaply mass produced leaves little, if any, room for real art. This gives an impulse, however, to the young talented film writers, actors and producers to unite their efforts in producing really good films.\n" +
				"\n" +
				"Theatre is a popular hobby in Great Britain as well The main theatrical city of the country is London There are more than 50 different theatres in the capital and about 200 professional companies World-famous for its concerts is Albert Hall in London. It performs from mid-July till mud-September, involving a great variety of orchestras and conductors, both British and foreign. Among the first-class orchestras are BBC Symphony, London Symphony, New Philharmonic and others. Choral singing is supposed to be a specialty of the British and there are successful choral societies in many cities.\n" +
				"\n" +
				"There are many amateur orchestras, choirs and opera groups even in small county towns. The best players are chosen to play in the county youth orchestras, and a few of the very best may be picked for the National Youth Orchestra. This orchestra is trained by distinguished conductors. It plays in the Royal Festival Hall and in other big concert halls. British people are fond of art and visit international and national music and drama festivals held in their country.";
		Set<String> res = StringToFile.createStringSet(str);
		for (String s : res){
			System.out.println(s);
		}
		//Helper.writeFile(res,"C://words.txt");
	}

}
