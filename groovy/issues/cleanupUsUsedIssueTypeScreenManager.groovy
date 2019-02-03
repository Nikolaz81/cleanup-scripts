boolean isPreview = false
import com.atlassian.jira.component.ComponentAccessor
import org.apache.log4j.Logger
import org.apache.log4j.Level

def log = Logger.getLogger("com.gonchik.scripts.groovy.deleteUnUsedIssueTypeSchemes")
log.setLevel(Level.DEBUG)

def schemeManager = ComponentAccessor.IssueTypeScreenSchemeManager
def sb = new StringBuilder()

sb.append("Deleted issue type screen schemes with no associated projects:<br/><br/>\n")
schemeManager.issueTypeScreenSchemes.each {
    if (it.isDefault()){
        return
    }
}

return sb.toString()