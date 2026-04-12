Get-FileHash linuxmint-22.3-cinnamon-64bit.iso
echo A081AB202CFDA17F6924128DBD2DE8B63518AC0531BCFE3F1A1B88097C459BD4 > hash.txt
type hash.txt
type sha256sum.txt
echo a081ab202cfda17f6924128dbd2de8b63518ac0531bcfe3f1a1b88097c459bd4 > sha256sum.txt
type sha256sum.txt
Compare-Object -ReferenceObject (Get-Content hash.txt) -DifferenceObject (Get-Content sha256sum.txt)
