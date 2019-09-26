package org.kodnuts.polyester;

import groovy.lang.Binding ;
import groovy.lang.GroovyShell ;
import java.io.File ;

public class Test {
    public static void main( String[] args ) throws Exception {
        Binding binding = new Binding() ;
        binding.setVariable( "SRESULT", "foo" ) ;

        GroovyShell gs = new GroovyShell( binding ) ;
        gs.evaluate( new File( "script.groovy" ) ) ;

        String sResult = (String)binding.getVariable( "SRESULT" ) ;
        System.out.printf( "FROM GROOVY: %s\n", sResult ) ;
    }
}
