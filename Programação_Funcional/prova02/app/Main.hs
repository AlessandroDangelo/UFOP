module Main (main) where

import Robot
import System.Environment (getArgs)

main :: IO ()
main = do
          args <- getArgs
          doIt args

doIt :: [String] -> IO ()
doIt [fm , fr]
   = do
        pm <- readLDM fm
        pr <- readLCR fr
        let
           m = either error id pm
           r = either error id pr
           m' = run r m
        print m'
doIt _ = putStrLn "Informe dois arquivos de entrada!"
